
import java.util.Scanner;

public class Calculator{

   public static void main(String[] args){
  
    while(true){
        System.out.print("Which Type of operation you want  tp perfom  +, -, /, %, * : ");
        Scanner scanner=new Scanner(System.in);
        char choice = scanner.next().charAt(0); 
        System.out.print("Enter two variables:");
        Double a,b;
        a=scanner.nextDouble();
        b=scanner.nextDouble();

    switch (choice) {
        case '+' : {
            double sum=a+b;
            System.out.printf("The sum of Two varibles are: %f:",sum);
            break;
        }
        case '-' : {
            double sub=a+b;
            System.out.printf("\n The sum of Two varibles are: %f:",sub);
             break;
        }
        case '/' : {
            double divide=a/b;
            System.out.printf("\n The sum of Two varibles are: %f:",divide);
             break;
        }
        case '*' : {
            double prod=a*b;
            System.out.printf("\n The sum of Two varibles are: %f:",prod);
             break;
        }
        case '%' : {
            double reminder=a%b;
            System.out.printf("\n The sum of Two varibles are: %f:",reminder);
             break;
        }
        
        default:
        System.out.printf("\n Please chose a valid operation.");
         break;
    }
     System.out.print("\n Do you want to perform any other calulation:  (Y/N )");
     char proceed=scanner.next().charAt(0);
     if(proceed == 'Y' || proceed == 'y' ){
        continue;
     }
     else  if(proceed == 'N' || proceed == 'n' ){
        scanner.close(); // Close Scanner after the loop ends
        break;
     }
     else {
        scanner.close(); // Close Scanner after the loop ends
        break;
     }

    } 
    
   
   } 

}
