import java.util.Arrays;

public class MinimumAndMaximumIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                    {5, 6, 8},
                 {  9, 10, 11, 0}};
        int min = minimum(arr);
        System.out.println("The Minimun Number is :" + min);
        int max = Maximum(arr);
        System.out.println("The Maximum Number is :" + max);

    }

    static int minimum(int[][] arr) {
        int min = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min) {
                    min = arr[row][col];
                    return min;
                }
            }

        }
        return min;
    }
    static int Maximum(int[][] arr) {
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}