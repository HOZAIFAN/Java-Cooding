import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// retrieve weather data from API - this backend logic will fetch the latest weather
// data from the external API and return it. The GUI will
// display this data to the user
public class WeatherApp {
    // fetch weather data for given location
    public static JSONObject getWeatherData(String locationName){
        // get location coordinates using the geolocation API
        JSONArray locationData = getLocationData(locationName);

        // ensure we got a valid location result
        if (locationData == null || locationData.isEmpty()) {
            System.out.println("Error: Location not found for '" + locationName + "'");
            return null;
        }

        // extract latitude and longitude data
        JSONObject location = (JSONObject) locationData.get(0);
        double latitude = (double) location.get("latitude");
        double longitude = (double) location.get("longitude");

        // build API request URL with updated timezone for Pakistan
        String urlString = "https://api.open-meteo.com/v1/forecast?"
                + "latitude=" + latitude
                + "&longitude=" + longitude
                + "&hourly=temperature_2m,relativehumidity_2m,weathercode,windspeed_10m"
                + "&timezone=Asia%2FKarachi";

        try {
            // call api and get response
            HttpURLConnection conn = fetchApiResponse(urlString);

            // check for response status
            // 200 - means that the connection was a success
            if (conn.getResponseCode() != 200) {
                System.out.println("Error: Could not connect to API, response code: "
                        + conn.getResponseCode());
                return null;
            }

            // store resulting JSON data
            StringBuilder resultJson = new StringBuilder();
            Scanner scanner = new Scanner(conn.getInputStream());
            while (scanner.hasNext()) {
                // read and store into the string builder
                resultJson.append(scanner.nextLine());
            }

            // close scanner and connection
            scanner.close();
            conn.disconnect();

            // parse through our data
            JSONParser parser = new JSONParser();
            JSONObject resultJsonObj = (JSONObject) parser.parse(resultJson.toString());

            // retrieve hourly data
            JSONObject hourly = (JSONObject) resultJsonObj.get("hourly");

            // we want to get the current hour's data
            // so we need to get the index of our current hour
            JSONArray time = (JSONArray) hourly.get("time");
            int index = findIndexOfCurrentTime(time);

            // get temperature
            JSONArray temperatureData = (JSONArray) hourly.get("temperature_2m");
            double temperature = (double) temperatureData.get(index);

            // get weather code
            JSONArray weathercodeArray = (JSONArray) hourly.get("weathercode");
            String weatherCondition = convertWeatherCode((long) weathercodeArray.get(index));

            // get humidity
            JSONArray relativeHumidity = (JSONArray) hourly.get("relativehumidity_2m");
            long humidity = (long) relativeHumidity.get(index);

            // get windspeed
            JSONArray windspeedData = (JSONArray) hourly.get("windspeed_10m");
            double windspeed = (double) windspeedData.get(index);

            // build the weather json data object that we are going to access in our frontend
            JSONObject weatherData = new JSONObject();
            weatherData.put("temperature", temperature);
            weatherData.put("weather_condition", weatherCondition);
            weatherData.put("humidity", humidity);
            weatherData.put("windspeed", windspeed);

            return weatherData;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    // retrieves geographic coordinates for given location name
    public static JSONArray getLocationData(String locationName){
        // replace any whitespace in location name to + to adhere to API's request format
        locationName = locationName.replaceAll(" ", "+");

        // build API url with location parameter
        String urlString = "https://geocoding-api.open-meteo.com/v1/search?name="
                + locationName
                + "&count=10&language=en&format=json";

        try {
            // call api and get a response
            HttpURLConnection conn = fetchApiResponse(urlString);

            // check response status
            // 200 means successful connection
            if (conn.getResponseCode() != 200) {
                System.out.println("Error: Could not connect to API (geolocation)");
                return null;
            } else {
                // store the API results
                StringBuilder resultJson = new StringBuilder();
                Scanner scanner = new Scanner(conn.getInputStream());

                // read and store the resulting json data into our string builder
                while (scanner.hasNext()) {
                    resultJson.append(scanner.nextLine());
                }

                // close scanner and connection
                scanner.close();
                conn.disconnect();

                // parse the JSON string into a JSON obj
                JSONParser parser = new JSONParser();
                JSONObject resultsJsonObj = (JSONObject) parser.parse(resultJson.toString());

                // get the list of location data the API generated from the location name
                JSONArray locationData = (JSONArray) resultsJsonObj.get("results");
                return locationData;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // couldn't find location
        return null;
    }

    // helper method to open HTTP GET connection
    private static HttpURLConnection fetchApiResponse(String urlString){
        try {
            // attempt to create connection
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // set request method to get
            conn.setRequestMethod("GET");

            // connect to our API
            conn.connect();
            return conn;
        } catch (IOException e) {
            e.printStackTrace();
        }

        // could not make connection
        return null;
    }

    private static int findIndexOfCurrentTime(JSONArray timeList){
        // get the string of current time in the same format as API's time array
        String currentTime = getCurrentTime();

        // iterate through the time list and see which one matches our current time
        for (int i = 0; i < timeList.size(); i++) {
            String time = (String) timeList.get(i);
            if (time.equalsIgnoreCase(currentTime)) {
                // return the index
                return i;
            }
        }

        return 0; // fallback to first entry if no match found
    }

    private static String getCurrentTime(){
        // get current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // format date to be 2025-06-12T15:00 (this is how it is read in the API)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH':00'");

        // format and return the current date and time
        String formattedDateTime = currentDateTime.format(formatter);

        return formattedDateTime;
    }

    // convert the weather code to something more readable
    private static String convertWeatherCode(long weathercode){
        String weatherCondition = "";
        if (weathercode == 0L){
            // clear
            weatherCondition = "Clear";
        } else if (weathercode > 0L && weathercode <= 3L){
            // cloudy
            weatherCondition = "Cloudy";
        } else if ((weathercode >= 51L && weathercode <= 67L)
                || (weathercode >= 80L && weathercode <= 99L)){
            // rain
            weatherCondition = "Rain";
        } else if (weathercode >= 71L && weathercode <= 77L){
            // snow
            weatherCondition = "Snow";
        } else {
            weatherCondition = "Unknown";
        }

        return weatherCondition;
    }
}
