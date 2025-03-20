import java.util.HashMap;
import java.util.Scanner;
//Write a program to check if a given key exists in a HashMap.
public class CheckKeyHashMap {
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            HashMap<String,Integer> Food= new HashMap<>();
            Food.put("pizza",740);
            Food.put("burger",230);
            Food.put("shoaroma",120);
            Food.put("fries",100);
            Food.put("paratha Roll",180);
            System.out.println("Enter the meal you want to check in menu=");
            String name=in.nextLine();
            int count=0;
            for( String meal : Food.keySet()){
                if(name.equals(meal)){
                    count=count+1;
                }
        }
            if(count>=1){
                System.out.println("The meal exist in the menu.");
            }else{
                System.out.println("THe food not exist sorry!");
            }
    }

}
