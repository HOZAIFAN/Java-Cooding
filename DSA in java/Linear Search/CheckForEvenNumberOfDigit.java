import java.util.Arrays;

public class CheckForEvenNumberOfDigit {
    public static void main(String[] args) {
        int[] arr = {223, 345, 335, 2, 12};
        int result = CheckEven(arr);
        System.out.println("The Number of Even Digits are : " + result);
    }

    static int CheckEven(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            String str = String.valueOf(num); // Convert number to String
            if (str.length() % 2 == 0) { // Check if number of digits is even
                count++;
            }
        }

        return count;
    }
}
