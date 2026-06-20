package DSA.Recursion;

import java.util.Scanner;

public class SumUpofN {
    static int Sum(int n){
        if(n==1){
            return 1;
        }
        return n+Sum(n-1);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number to find Sum:");
        int n=in.nextInt();
        System.out.println("The Sum is " + Sum(n));



    }
}
