package DSA.Recursion;

import java.util.Scanner;

public class SearchingELementLInearly {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Target value:");
        int n=in.nextInt();
        System.out.println("Output: " + sorted(arr,n,0));
    }
    static boolean sorted(int arr[] ,int target , int index){
        if(index>=arr.length){
            return false;
        }
        return arr[index]==target || sorted(arr, target, index+1);
    }
}
