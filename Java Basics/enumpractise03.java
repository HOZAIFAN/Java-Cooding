import java.util.Scanner;

enum Days{
    MONDAY("Working-day"),TUESDAY("Working-day"),WEDNESDAY("Working-day"),THURSDAY("Working-day"),FRINDAY("half-Working-day"),SATURDAY("Week-day"),SUNDAY("Week-day");
    private String status;
    Days(String status){
        this.status=status;
    }
    public String getDays(){
        return status;
    }
}
public class enumpractise03 {
 public static void main(String[] args){
     Scanner scanner=new Scanner(System.in);
     System.out.print("Enter of which day you want to check status:");
     String day=scanner.next().toUpperCase();
     try {
         Days check=Days.valueOf(day);
         System.out.printf("The status of   Day  %s  is  %s . ",check,check.getDays());
     }catch (IllegalArgumentException e ){
         System.out.printf("Enter a valid day");

     }
 }
}
