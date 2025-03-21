import java.util.Scanner;

public class DifferentBuiltInMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = scanner.nextLine();

        while (true) {
            System.out.println("\nWhich operation do you want to perform:");
            System.out.println("1. Check Length");
            System.out.println("2. Convert to Upper Case");
            System.out.println("3. Convert to Lower Case");
            System.out.println("4. Trim White Spaces");
            System.out.println("5. Find Index of Letter");
            System.out.println("6. Find Character at Index");
            System.out.println("7. Check Equality");
            System.out.println("9. Exit");
            System.out.print("\nEnter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline after nextInt()

            if (choice == 1) {
                int len = name.length();
                System.out.printf("The length of '%s' is %d\n", name, len);
            } else if (choice == 2) {
                System.out.printf("Converted to Uppercase: %s\n", name.toUpperCase());
            } else if (choice == 3) {
                System.out.printf("Converted to Lowercase: %s\n", name.toLowerCase());
            } else if (choice == 4) {
                System.out.printf("Trimmed name: '%s'\n", name.trim());
            } else if (choice == 5) {
                System.out.print("Enter the letter to check index of: ");
                String letter = scanner.nextLine();
                int index = name.indexOf(letter);
                System.out.printf("The index of letter '%s' is: %d\n", letter, index);
            } else if (choice == 6) {
                System.out.print("Enter the index to check value: ");
                int index = scanner.nextInt();
                if (index >= 0 && index < name.length()) {
                    char lett = name.charAt(index);
                    System.out.printf("The letter at index %d is: %c\n", index, lett);
                } else {
                    System.out.println("Invalid index! Out of range.");
                }
            } else if (choice == 7) {
                System.out.print("Enter another name to compare: ");
                String anotherName = scanner.nextLine();
                if (name.equals(anotherName)) {
                    System.out.println("Names are equal.");
                } else {
                    System.out.println("Names are not equal.");
                }
            } else if (choice == 9) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Enter a valid choice!");
            }
        }
        scanner.close();
    }
}
