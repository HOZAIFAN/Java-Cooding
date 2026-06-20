import java.util.Arrays;

public class LineraSearchInString {
    public static void main(String[] args) {
        String name="Hozaifa";
        int index=search(name, 'a');//3
        System.out.println("The character is at index:"+index);
        System.out.println(Arrays.toString(name.toCharArray()) );
    }
    static int search(String n,char target){
        if(n.length()==0){
            return -1;
        }
        for (int i=0; i <n.length() ; i++) {
            char check=n.charAt(i);
            if( check ==target){
                return i;
            }
        }
        return -1;
    }

}
