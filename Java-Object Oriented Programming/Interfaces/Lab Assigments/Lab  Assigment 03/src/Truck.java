public class Truck extends Vehicle {

    private double load_capacity;

    public Truck(String id, String brand, String model, int year, double price, boolean available, double load_capacity) {
        super(id, brand, model, year, price, available);
        this.load_capacity = load_capacity;
    }

    public void setLoad_capacity(double load_capacity) {
        this.load_capacity = load_capacity;
    }

    public double getLoad_capacity() {
        return load_capacity;
    }
}
