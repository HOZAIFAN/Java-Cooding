package DSA.StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPreFix {
    public static String infixToPostfix(String data) {
        Stack<String> s = new Stack<>();
        StringBuilder Ans = new StringBuilder();

        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);

            // If operand, add directly to output
            if (Character.isLetterOrDigit(ch)) {
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

    public static String infixToPrefix(String infix) {
        // Step 1: Reverse the infix string
        StringBuilder sb = new StringBuilder(infix).reverse();

        // Step 2: Swap '(' and ')'
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') {
                sb.setCharAt(i, ')');
            } else if (sb.charAt(i) == ')') {
                sb.setCharAt(i, '(');
            }
        }

        // Step 3: Convert to postfix
        String postfix = infixToPostfix(sb.toString());

        // Step 4: Reverse postfix to get prefix
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the expression in Infix to convert into Prefix: ");
        String data = in.nextLine();

        String prefix = infixToPrefix(data);
        System.out.println("The String is converted from Infix to Prefix: " + prefix);
    }
}
