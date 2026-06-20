package DSA.StackAndQueues;

import java.util.ArrayList;

public class StackImplementationUsingArrayList {
    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.isEmpty();  // Improved readability
        }

        // Push
        public static void push(int data) {
            list.add(data);
        }

        // Pop
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack.push(2);
        Stack.push(3);
        Stack.pop();
        System.out.println("Top element: " + Stack.peek());  // Should print 2
        System.out.println("Stack contents: " + Stack.list); // Should print [2]
    }
}
