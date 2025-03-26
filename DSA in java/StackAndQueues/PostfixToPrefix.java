package DSA.StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToPrefix {
    public static String PostfixToPrefix(String data) {
        Stack<String> s = new Stack<>();
        char ch;

        for (int i = 0; i < data.length(); i++) {
            ch = data.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                s.push(String.valueOf(ch)); // Push operand
            } else {
                if (s.size() < 2) {
                    return "Invalid Expression"; // Safety check
                }
                String t1 = s.pop(); // First operand
                String t2 = s.pop(); // Second operand
                String conv = ch + t2 + t1; // Form prefix
                s.push(conv);
            }
        }

        return s.isEmpty() ? "Invalid Expression" : s.pop();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Expression you want to convert: ");
        String exp = in.nextLine();
        System.out.println("The Converted Expression from Postfix to Prefix is: " + PostfixToPrefix(exp));
        in.close();
    }
}
