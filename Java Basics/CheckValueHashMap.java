import java.util.HashMap;
import java.util.Scanner;
public class CheckValueHashMap {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        HashMap<String,Integer> Food= new HashMap<>();
        Food.put("pizza",740);
        Food.put("burger",230);
        Food.put("shoaroma",120);
        Food.put("fries",100);
        Food.put("paratha Roll",180);
        System.out.println("Enter the price you want to check in menu=");
        int price=in.nextInt();
        int count=0;
        for( int i : Food.values()){
            if(price==i){
                count=count+1;
            }
        }
        if(count>=1){
            System.out.println("Yes we have meal that is off the price you entered.");
        }else{
            System.out.println("THe food not exist sorry!");
        }
    }
}
