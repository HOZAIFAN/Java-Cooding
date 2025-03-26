package DSA.StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostFix {
    public static String Infixtopostfix(String data) {
        Stack<String> s = new Stack<>();
        String st = data;
        StringBuilder Ans = new StringBuilder();  // Use StringBuilder for efficiency

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            // If operand, add directly to output
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                Ans.append(ch);
            }
            // If '(', push to stack
            else if (ch == '(') {
                s.push(String.valueOf(ch));
            }
            // If ')', pop and output until '(' is found
            else if (ch == ')') {
                while (!s.isEmpty() && !s.peek().equals("(")) {
                    Ans.append(s.pop());
                }
                s.pop(); // Pop '('
            }
            // Operator encountered
            else {
                while (!s.isEmpty() && precedence(s.peek().charAt(0)) >= precedence(ch)) {
                    Ans.append(s.pop());
                }
                s.push(String.valueOf(ch));
            }
        }
        // Pop remaining operators from stack
        while (!s.isEmpty()) {
            Ans.append(s.pop());
        }
        return Ans.toString();
    }
    public static int precedence(char op) {
        switch (op) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the expression in Infix to convert into Postfix: ");
        String data = in.nextLine();
        System.out.println("The String is converted from infix to postfix: " + Infixtopostfix(data));
    }
}
