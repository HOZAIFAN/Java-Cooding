package DSA.StackAndQueues;
import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement {
    public static ArrayList<Integer> Nextgreaterelement(int[] data) {
        ArrayList<Integer> NGE = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        // ✅ Initialize NGE with -1 (default value)
        for (int i = 0; i < data.length; i++) {
            NGE.add(-1);
        }

        for (int i = data.length - 1; i >= 0; i--) {
            // 🔹 Remove elements smaller than or equal to data[i]
            while (!s.isEmpty() && s.peek() <= data[i]) {
                s.pop();
            }
            // 🔹 Set NGE[i] to top of stack (or -1 if stack is empty)
            if (!s.isEmpty()) {
                NGE.set(i, s.peek());
            } 
            // 🔹 Push current element onto stack
            s.push(data[i]);
        }
        return NGE;
    }

    public static void main(String[] args) {
        int[] element = {5, 4, 2, 8, 5};
        ArrayList<Integer> result = Nextgreaterelement(element);
        System.out.println(result);  // Output: [8, 8, 8, -1, -1]
    }
}
