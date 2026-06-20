public class OOPS {
    int age;
    String Name;

    // Constructor
    public OOPS(int age, String Name) {
        this.Name = Name;  // Assigning values to instance variables
        this.age = age;
    }

    public static void main(String[] args) { // Correct main method signature
        OOPS japi = new OOPS(18, "Muhammad Hozaifa Naeem");
        // Access instance variables correctly
        System.out.printf("Hello %s of age %d, what do you like to take? Coffee or Tea: ", japi.Name, japi.age);
    }
}
