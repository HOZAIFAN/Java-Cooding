public class Package {

    protected String senderName;
    protected String senderAddress;
    protected String recipientName;
    protected String recipientAddress;
    protected double weight;          // in ounces
    protected double costPerOunce;    // cost per ounce

    public Package(String senderName, String senderAddress,
                   String recipientName, String recipientAddress,
                   double weight, double costPerOunce) {

        if(weight <= 0 || costPerOunce <= 0) {
            throw new IllegalArgumentException("Weight and cost per ounce must be positive.");
        }

        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.weight = weight;
        this.costPerOunce = costPerOunce;
    }

    public double calculateCost() {
        return weight * costPerOunce;
    }

    public void displayInfo() {
        System.out.println("Sender: " + senderName + " | " + senderAddress);

        System.out.println("Recipient: " + recipientName + " | " + recipientAddress);

    }

}
