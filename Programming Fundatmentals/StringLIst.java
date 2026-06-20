import java.util.ArrayList;
import java.util.Scanner;

public class StringLIst {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<String> Names= new ArrayList<>();
        for(int i=1;i<6;i++){
            System.out.printf("Enter No:%d Name:",i);
            String Name=in.nextLine();
            Names.add(Name);
        }
        in.close();
        Names.remove(2);
        System.out.println(Names);
    }
}
