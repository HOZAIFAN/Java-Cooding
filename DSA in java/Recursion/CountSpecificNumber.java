package DSA.Recursion;

public class CountSpecificNumber {
    static int countDigit(int n, int target) {
        if (n == 0) {
            return 0;
        }
        int count = (n % 10 == target) ? 1 : 0;
        return count + countDigit(n / 10, target);
    }

    public static void main(String[] args) {
        int number = 122334232;  // Example number
        int digit = 2;  // Digit to count
        System.out.println("The digit " + digit + " appears " + countDigit(number, digit) + " times.");
    }
}
