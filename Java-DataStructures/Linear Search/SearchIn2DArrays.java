import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr={ {1,2,3,4},
                      {5,6,8},
                      {9,10,11,12} };
        int[] ans= Target( arr ,5);
        System.out.println("The index of the target element is:"+Arrays.toString(ans));

    }
    static int[] Target(int [][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
