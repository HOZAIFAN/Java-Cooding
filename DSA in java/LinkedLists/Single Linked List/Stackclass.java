package DSA.LinkedLists.DSA;

public class Stackclass {
    static class Node {
        int data;
        Node next;

        Node(int data) { // Constructor for integer node
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newnode = new Node(data);
            newnode.next = head;
            head = newnode;
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("The stack is empty");
                return -1;  // Return -1 to indicate an empty stack
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("The stack is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // Should print 30
        System.out.println("Popped: " + stack.pop()); // Should remove 30
        System.out.println("Popped: " + stack.pop()); // Should remove 20
        System.out.println("Top element: " + stack.peek()); // Should print 10
    }
}
