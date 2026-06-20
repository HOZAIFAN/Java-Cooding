import java.util.HashMap;

public class GetValueHashMap {
    public static void main(String[] args){
        HashMap<String,Integer> Food= new HashMap<>();
        Food.put("Pizza",740);
        Food.put("Burger",230);
        Food.put("Shoaroma",120);

        //accesign the values
        System.out.println(Food.get("Pizza"));
        System.out.println(Food.get("Burger"));
        System.out.println(Food.get("Shoaroma"));
        //checking the size of Hashmap
        System.out.println("Ther size of the HAShMAP is:"+Food.size());
        /* Clearing the hashmap */
        Food.clear();
        System.out.println("Ther  HAShMAP is now cleard:" + Food);

    }
}
