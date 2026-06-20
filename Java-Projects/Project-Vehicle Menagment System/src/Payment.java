public class Payment {
    private String payment_id;
    private String rental_id;
    private double amount;
    private String payment_method;
    private String payment_date;

    public Payment(String payment_id, String rental_id, double amount, String payment_method, String payment_date) {
        this.payment_id = payment_id;
        this.rental_id = rental_id;
        this.amount = amount;
        this.payment_method = payment_method;
        this.payment_date = payment_date;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setRental_id(String rental_id) {
        this.rental_id = rental_id;
    }

    public String getRental_id() {
        return rental_id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void makePayment() {
        System.out.println("Payment of " + amount + " made through " + payment_method);
    }

    public void refundPayment() {
        System.out.println("Refund has been done for payment ID: " + payment_id);
    }
}
