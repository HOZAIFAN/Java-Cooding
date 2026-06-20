public class Booking implements ReceiptGenerate {

    private String booking_id;
    private Rental rental;
    private String status;

    public Booking(String booking_id, Rental rental, String status) {
        this.booking_id = booking_id;
        this.rental = rental;
        this.status = status;
    }

    public void setBooking_id(String booking_id) {
        this.booking_id = booking_id;
    }

    public String getBooking_id() {
        return booking_id;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    public Rental getRental() {
        return rental;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void createBooking() {
        System.out.println("Booking created with Id: " + booking_id);
    }

    public void cancelBooking() {
        this.status = "Cancelled";
        System.out.println("Booking " + booking_id + " has been cancelled.");
    }

    @Override
    public void generateReceipt() {
        System.out.println("Receipt generated for booking " + booking_id);
        rental.generateReceipt();
    }
}
