public class SeacrhInrange {
    public static void main(String[] args) {
        int arr[]={21,32,24,54,22,57,89};
        int index=search(arr,57,2,5);
        System.out.println("The index of the targer is :"+ index);//5
    }
    static int search(int[] arr, int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i<=end ; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        //this -1 show that the element is not found
        return -1;
    }
}
