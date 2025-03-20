import java.util.HashMap;
import java.util.Scanner;

public class CopyHashMap {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        HashMap<String,Integer> Food= new HashMap<>();
        Food.put("pizza",740);
        Food.put("burger",230);
        Food.put("shoaroma",120);
        Food.put("fries",100);
        Food.put("paratha Roll",180);
        HashMap<String,Integer> Fruits= new HashMap<>();
        Fruits.put("Mango",120);
        Fruits.put("Apple",140);
        Fruits.put("banana",150);
        Food.putAll(Fruits);
        System.out.print("The combine HAshmap is:"+ Food);


    }

}
