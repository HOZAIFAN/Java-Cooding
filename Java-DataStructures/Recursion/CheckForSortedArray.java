package DSA.Recursion;

public class CheckForSortedArray {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        System.out.println("Array is sorted :" + sorted(arr,0));
        int arr2[]={2,5,4,6,2,1};
        System.out.println("Array is  sorted :" + sorted(arr2,0));
    }

    static boolean sorted(int arr[] , int index ){
        if(index==arr.length-1){
            return true;
        }
        return  arr[index]<arr[index+1] && sorted( arr ,index+1);
    }
}
