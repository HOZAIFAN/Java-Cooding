import java.util.ArrayList;
import java.util.Scanner;

interface RentalOperations {
    double calculateRent(int days);
}

abstract class Vehicle implements RentalOperations {
    protected String vehicleId;
    protected String brand;
    protected int days;

    public Vehicle(String id, String brand, int days) {
        this.vehicleId = id;
        this.brand = brand;
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public String getBrand() {
        return brand;
    }

    public String getId() {
        return vehicleId;
    }

    public abstract String getType();
}

class Car extends Vehicle {

    public Car(String id, String brand, int days) {
        super(id, brand, days);
    }

    public double calculateRent(int days) {
        return days * 50;
    }

    public String getType() {
        return "Car";
    }
}

class Bike extends Vehicle {

    public Bike(String id, String brand, int days) {
        super(id, brand, days);
    }

    public double calculateRent(int days) {
        return days * 20;
    }

    public String getType() {
        return "Bike";
    }
}

class RentalSystem {
    ArrayList<Vehicle> list = new ArrayList<>();

    public void add(Vehicle v) {
        list.add(v);
    }

    public ArrayList<Vehicle> getAll() {
        return list;
    }
}

public class VehicleRentalGUI {

    public static void main(String[] args) {

        RentalSystem system = new RentalSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--- Vehicle Rental System ---");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Show All Records");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {

                System.out.print("Enter ID: ");
                String id = sc.nextLine();

                System.out.print("Enter Brand: ");
                String brand = sc.nextLine();

                System.out.print("Enter Type (Car/Bike): ");
                String type = sc.nextLine();

                System.out.print("Enter Days: ");
                int days = sc.nextInt();

                Vehicle v;

                if (type.equalsIgnoreCase("Car"))
                    v = new Car(id, brand, days);
                else
                    v = new Bike(id, brand, days);

                system.add(v);

                System.out.println("Vehicle Added!");

            } else if (ch == 2) {

                if (system.getAll().isEmpty()) {
                    System.out.println("No records found.");
                } else {
                    for (Vehicle v : system.getAll()) {
                        double rent = v.calculateRent(v.getDays());
                        System.out.println("ID: " + v.getId()
                                + " Type: " + v.getType()
                                + " Brand: " + v.getBrand()
                                + " Days: " + v.getDays()
                                + " Rent: " + rent);
                        System.out.println("-----------------------");
                    }
                }

            } else if (ch == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
