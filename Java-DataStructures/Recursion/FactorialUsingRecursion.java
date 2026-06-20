package DSA.Recursion;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static int  Factorial(int n){
        if(n==1) {
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number to find Factorial:");
        int n=in.nextInt();
        System.out.println("The Factorial is " + Factorial(n));

    }
}
