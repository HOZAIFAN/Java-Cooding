import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CreatingArrayList {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner in=new Scanner(System.in);
        for (int i=1 ; i<6 ; i++ ){
            System.out.printf("Enter the number  %d :",i);
            int num= in.nextInt();
            numbers.add(num);
        }
        Collection.sort(numbers);
        in.close(); //
        System.out.println("Numbers stored in ArrayList: " + numbers);
    }
}
