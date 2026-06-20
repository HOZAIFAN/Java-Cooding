public class Main {
    public static void main(String[] args) {


        int[] arr1 = {80, 75, 90, 85, 95};
        int[] arr2 = {60, 70, 65, 75, 80};

        Student s1 = new Student("Ali", arr1);
        Student s2 = new Student("Ammad", arr2);

        double avg1 = s1.Average();
        double avg2 = s2.Average();

        System.out.println("Average of " + s1.getName() + ": " + avg1);
        System.out.println("Average of " + s2.getName() + ": " + avg2);

        // Compare Averages
        if (avg1 > avg2) {
            System.out.println(s1.getName() + " has higher average.");
        } else if (avg2 > avg1) {
            System.out.println(s2.getName() + " has higher average.");
        } else {
            System.out.println("Both students have same average.");
        }

        // Creating third student
        Student s3 = new Student(s1.getName(), arr2);

        System.out.println("\nThird Student Created:");
        System.out.println("Name: " + s3.getName());
        System.out.println("Average (using array of student 2): " + s3.Average());
    }

}
