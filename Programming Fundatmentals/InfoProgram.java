import java.util.Scanner;
public class InfoProgram {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("What is your name:");
        String name=scanner.nextLine();
        System.out.print("\n What is your age:");
        int age=scanner.nextInt();
        System.out.print("\n what is your cgpa:");
        double cgpa=scanner.nextDouble();
        System.out.print("My name is " + name +" my age is " + age + " i got cgpa  "+ cgpa);
        

        scanner.close();
    }
    
}
