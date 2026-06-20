//Write a Java program to create a HashMap, store some key-value pairs, and print the HashMap.

import java.util.HashMap;
import java.util.Scanner;

public class CreateHashMap {
    public static void  main(String[] args){
        Scanner in=new Scanner(System.in);
        HashMap<String,Integer> Fruits=new HashMap<>();
        for(int i=1;i<=5;i++){
            //This will save the name and there prises of 5 fruits.
            System.out.printf("Enter the Fruit at No %d=",i);
            String name=in.nextLine();
            System.out.printf("Enter the price of No: %d fruit=" ,i);
            int number=in.nextInt();
            in.nextLine();
            Fruits.put(name,number);
        }
        //pritn the hashmaps
        System.out.println(Fruits);
        in.close();
    }
}
