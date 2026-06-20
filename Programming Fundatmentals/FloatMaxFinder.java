import java.util.ArrayList;
import java.util.Scanner;

public class FloatMaxFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Float> numbers = new ArrayList<>();
        System.out.println("Enter the Numbers to check for the largest.....");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Enter No %d: ", i);
            float num = in.nextFloat();
            numbers.add(num);
        }
        float MaxNum = numbers.get(0);
        for (int j = 1; j < numbers.size(); j++) {
            if (MaxNum < numbers.get(j)) {
                MaxNum = numbers.get(j);
            }
        }

        in.close();
        System.out.println("The MAX number is: " + MaxNum);
    }
}
