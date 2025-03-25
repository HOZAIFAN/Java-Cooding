import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number to Check for Prime: ");
        int num = scanner.nextInt();
        
        if (num <= 1) {
            System.out.println("Not a prime number");
        } 
        else if (num == 2) {
            System.out.println("Prime number");
        } 
        else {
            boolean isPrime = true; // Assume the number is prime

            for (int i = 2; i <= Math.sqrt(num); i++) { // Check only up to √num
                if (num % i == 0) {
                    isPrime = false; // Found a divisor, not prime
                    break; // No need to check further
                }
            }

            if (isPrime) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a prime number");
            }
        }
        scanner.close();
    }
}
