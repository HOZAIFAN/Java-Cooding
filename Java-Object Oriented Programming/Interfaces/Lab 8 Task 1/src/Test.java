public class Test {
    public static void main(String[] args) {

        Package p1 = new Package(
                "Ali", "Lahore",
                "Rafay", "Karachi",
                10, 2.5);

        Package p2 = new TwoDayPackage(
                "Sara", "Islamabad",
                "Ahmed", "Peshawar",
                8, 3.0, 15);

        Package p3 = new OvernightPackage(
                "Usman", "Multan",
                "Zain", "Quetta",
                5, 2.0, 1.5);


        Package[] packages = { p1, p2, p3 };

        for(Package pkg : packages) {
            pkg.displayInfo();
            System.out.println("Shipping Cost: " + pkg.calculateCost());

        }
    }
}
