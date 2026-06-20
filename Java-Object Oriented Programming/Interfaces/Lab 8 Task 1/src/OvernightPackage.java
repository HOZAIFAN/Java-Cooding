public class OvernightPackage extends Package {
    private double additionalFee; // additional fee per ounce

    public OvernightPackage(String senderName, String senderAddress,
                            String recipientName, String recipientAddress,
                            double weight, double costPerOunce, double additionalFee) {

        super(senderName, senderAddress, recipientName, recipientAddress, weight, costPerOunce);

        if(additionalFee < 0) {
            throw new IllegalArgumentException("Additional fee must be positive.");
        }

        this.additionalFee = additionalFee;
    }

    @Override
    public double calculateCost() {
        return weight * (costPerOunce + additionalFee);
    }
}
