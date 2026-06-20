package DSA.Recursion;

import java.util.Scanner;

public class PrintNumber_Nto1 {
    //recursively print one less number
    public static void Numbers(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        Numbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=in.nextInt();
        Numbers(n);
    }

}
