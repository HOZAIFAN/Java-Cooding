public class LinearSeacrh {
    public static void main(String[] args) {
        int arr[]={21,32,24,54,22,57,89};
        int index=search(arr,22);
        System.out.println("The index of the targer is :"+ index);//4
    }
    static int search(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        //this -1 show that the element is not found
        return -1;

    }
}
