import java.util.Scanner;
public class BasicGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Name:");
        String Name=scanner.nextLine();
        System.out.print("Input any adjective 'Any quality' :");
        String Quality=scanner.nextLine();
        System.out.print("Enter the noun :");
        String Noun=scanner.nextLine();
        System.out.print("Enter the verb 'Any action':");
        String Action=scanner.nextLine();
        System.out.print("Enter the place :");
        String Place=scanner.nextLine();

      System.out.printf("One day,%s wake up feeling %s Suddenly, a gaint %s apperred and started %s All over the %s",Name,Quality,Noun,Action,Place);
        scanner.close();
        

    }
}