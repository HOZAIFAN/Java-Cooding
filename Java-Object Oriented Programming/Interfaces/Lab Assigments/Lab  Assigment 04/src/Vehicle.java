public class Vehicle implements VehicleInfo {

    private String vehicle_id;
    private String brand;
    private String model;
    private int year;
    private double price_per_day;
    private boolean is_available;

    public Vehicle(String vehicle_id, String brand, String model, int year, double price_per_day, boolean is_available){
        this.vehicle_id = vehicle_id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price_per_day = price_per_day;
        this.is_available = is_available;
    }

    public void setVehicle_id(String vehicle_id){
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_id(){
        return vehicle_id;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setPrice_per_day(double price_per_day){
        this.price_per_day = price_per_day;
    }

    public double getPrice_per_day() {
        return price_per_day;
    }

    public boolean isAvailable() {
        return is_available;
    }

    public void setAvailable(boolean is_available){
        this.is_available = is_available;
    }

    public void updateAvailability(boolean available) {
        this.is_available = available;
        System.out.println("Vehicle availability is now: " + available);
    }


    public void displayDetails() {
        System.out.println("Vehicle: " + brand + " " + model + " (" + year + ") | Price per day: " + price_per_day + " | Available: " + is_available);
    }
}
