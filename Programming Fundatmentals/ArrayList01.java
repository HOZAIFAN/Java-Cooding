import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        students.add("Hozaifa");
        students.add("Aashir");
        students.add("Hani Kazmi");
        students.add("Asad Ali");

        System.out.println("These are some students enrolled in the CS programme:");
        for (String student : students) {
            System.out.println(student);
        }

        while (true) {
            System.out.print("\nWhich operation do you want to perform? \n1. Add  \n2. Remove  \n3. Show list  \n4. Exit\nEnter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the student to be enrolled: ");
                    String studentName = scanner.nextLine();
                    students.add(studentName);
                    System.out.println(studentName + " added successfully!");
                    break;

                case 2:
                    System.out.print("Enter the name of the student to be removed: ");
                    String removeName = scanner.nextLine();

                    if (students.removeIf(student -> student.equals(removeName))) {
                        System.out.println(removeName + " removed successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 3:
                    System.out.println("Enrolled Students List:");
                    for (String student : students) {
                        System.out.println(student);
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;  // Exit program

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
