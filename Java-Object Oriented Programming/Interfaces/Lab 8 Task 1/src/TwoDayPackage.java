public class TwoDayPackage extends Package {
    private double flatFee;

    public TwoDayPackage(String senderName, String senderAddress,
                         String recipientName, String recipientAddress,
                         double weight, double costPerOunce, double flatFee) {

        super(senderName, senderAddress, recipientName, recipientAddress, weight, costPerOunce);

        if(flatFee < 0) {
            throw new IllegalArgumentException("Flat fee must be positive.");
        }

        this.flatFee = flatFee;
    }


    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }


}
