package DSA.StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
    public static boolean checkBalance(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                st.push(str.charAt(i));
            }
            else {
                if (st.isEmpty()) {
                    System.out.print("The stack is Empty");
                    return false;
                }
                else {
                    char ch = st.pop();
                    if (! ((str.charAt(i) == ')' && ch == '(') || (str.charAt(i) == '}' && ch == '{') || (str.charAt(i) == ']' && ch == '[') ) ){
                        System.out.println("Not matched");
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the parentheses to check for their balance: ");
        String str = in.nextLine();
        System.out.print(checkBalance(str));
    }
}
