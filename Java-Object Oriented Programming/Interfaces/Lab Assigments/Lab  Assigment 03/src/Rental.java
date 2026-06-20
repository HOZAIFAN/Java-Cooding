public class Rental implements ReceiptGenerate {

    private String rental_id;
    private Vehicle vehicle;
    private Customer customer;
    private String start_date;
    private String end_date;
    private double total_cost;

    public Rental(String rental_id, Vehicle vehicle, Customer customer, String start_date, String end_date, double total_cost) {
        this.rental_id = rental_id;
        this.vehicle = vehicle;
        this.customer = customer;
        this.start_date = start_date;
        this.end_date = end_date;
        this.total_cost = total_cost;
    }

    public void setRental_id(String rental_id){
        this.rental_id = rental_id;
    }

    public String getRental_id() {
        return rental_id;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setTotal_cost(double total_cost) {
        this.total_cost = total_cost;
    }

    public double getTotal_cost() {
        return total_cost;
    }

    public double calculateCost(int days) {
        total_cost = days * vehicle.getPrice_per_day();
        return total_cost;
    }

    @Override
    public void generateReceipt() {
        System.out.println("\nRental Receipt");
        System.out.println("Rental ID: " + rental_id);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Vehicle: " + vehicle.getBrand() + " " + vehicle.getModel());
        System.out.println("Rental Period: " + start_date + " to " + end_date);
        System.out.println("Total Cost: " + total_cost);
        System.out.println();
    }
}
