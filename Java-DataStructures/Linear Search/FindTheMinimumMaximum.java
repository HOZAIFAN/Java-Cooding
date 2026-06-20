public class FindTheMinimumMaximum {
    public static void main(String[] args) {
        int arr[]={22,334,55,654,5,454,66};
        int min=minimum(arr);
        System.out.printf("The minimum number is : %d",min);
        int max=maximun(arr);
        System.out.printf("\nThe maximun number is : %d",max);
    }
    static int minimum(int[] arr){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    static int maximun(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}
