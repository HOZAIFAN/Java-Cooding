import java.util.Scanner;
public class InputJava {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("What is your name:");
        
        String name=scanner.nextLine();
        System.out.println("oh litterly "+ name);


        scanner.close();
    }
    
}
