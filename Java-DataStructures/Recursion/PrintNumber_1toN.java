package DSA.Recursion;
import java.util.Scanner;
public class PrintNumber_1toN {
    //recursively print one greater element
    public static void Numbers (int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        Numbers(i+1,n);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numbers to print:");
        int n=in.nextInt();
        int i=1;
        Numbers(i,n);
    }
}
