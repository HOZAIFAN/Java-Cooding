import java.util.Scanner;

public class TeampreatureChecker{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the teampreature:");
        Double teamp=scanner.nextDouble();
        if((teamp>0) && (teamp <30)){
            System.out.print("The Teampreature is normal.");
        }
        else if (teamp>30){
            System.out.print("The teampreature is hot");

        }
        else{
            System.out.println("The teampreature is cold");
        }
        scanner.close();


    }
}