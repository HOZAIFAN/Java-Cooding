import java.util.*;
public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bike bike1 = new Bike("B01", "Yamaha YBR", "G version",
                2023, 1200, true, true);
        Rental bikeRental1 = new Rental("R01", bike1,
                new Customer("C01", "Ali", "ali@gmail.com", "123", "L001", "None"),
                "2025-01-01", "2025-01-03", 15000);
        Bike bike2 = new Bike("B02", "Honda 125", "CG",
                2022, 1500, false, true);

        Rental bikeRental2 = new Rental("R02", bike2,
                new Customer("C02", "Hamza", "hamza@gmail.com", "234", "L002", "None"),
                "2025-02-01", "2025-02-04", 10000);

        Bike bike3 = new Bike("B03", "Suzuki GS150", "Standard",
                2023, 1000, true, true);

        Rental bikeRental3 = new Rental("R03", bike3,
                new Customer("C03", "Bilal", "bilal@gmail.com", "345", "L003", "None"),
                "2025-03-01", "2025-03-02", 5000);

        ArrayList<Rental> bikeList = new ArrayList<>();
        bikeList.add(bikeRental1);
        bikeList.add(bikeRental2);
        bikeList.add(bikeRental3);

        Car car1 = new Car("C01", "Civic", "Sedan", 2023, 3000, true, 4);
        Rental carRental1 = new Rental("R04", car1,
                new Customer("C04", "Zain", "zain@gmail.com", "456", "L004", "None"),
                "2025-01-05", "2025-01-07", 0);

        Car car2 = new Car("C02", "Corolla", "Sedan", 2024, 2500, true, 4);
        Rental carRental2 = new Rental("R05", car2,
                new Customer("C05", "Rafay", "rafay@gmail.com", "567", "L005", "None"),
                "2025-02-05", "2025-02-08", 0);

        Car car3 = new Car("C03", "City", "Sedan", 2023, 4000, true, 4);
        Rental carRental3 = new Rental("R06", car3,
                new Customer("C06", "Usama", "usama@gmail.com", "678", "L006", "None"),
                "2025-03-05", "2025-03-09", 0);

        ArrayList<Rental> carList = new ArrayList<>();
        carList.add(carRental1);
        carList.add(carRental2);
        carList.add(carRental3);

        Booking bk1 = new Booking("B01", bikeRental1, "Confirmed");
        Booking bk2 = new Booking("B02", carRental1, "Pending");
        Booking bk3 = new Booking("B03", bikeRental3, "Denied");

        ArrayList<Booking> bookingList = new ArrayList<>();
        bookingList.add(bk1);
        bookingList.add(bk2);
        bookingList.add(bk3);

        boolean exit = false;

        while (!exit) {
            System.out.println("\nRental System Menu");
            System.out.println("1. View Bike Rentals");
            System.out.println("2. View Car Rentals");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nBike Rentals");
                    for (int i = 0; i < bikeList.size(); i++) {
                        Rental r = bikeList.get(i);
                        double cost = r.calculateCost(3);
                        System.out.println("Customer " + r.getCustomer().getName() +
                                " with rental ID " + r.getRental_id() +
                                " will be charged " + cost +
                                " for renting bike " + r.getVehicle().getBrand());
                    }
                    break;

                case 2:
                    System.out.println("\nCar Rentals");
                    for (int i = 0; i < carList.size(); i++) {
                        Rental r = carList.get(i);
                        double cost = r.calculateCost(3);
                        System.out.println("Customer " + r.getCustomer().getName() + " with rental ID " + r.getRental_id() + " will be charged " + cost +
                                " for renting car " + r.getVehicle().getBrand());
                    }
                    break;

                case 3:
                    System.out.println("\nBookings");
                    for (int i = 0; i < bookingList.size(); i++) {
                        Booking b = bookingList.get(i);
                        b.createBooking();
                        b.generateReceipt();
                    }
                    break;

                case 4:
                    System.out.println("Thanks for using our system");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 1 to 4.");
            }
        }

        sc.close();
    }
}
