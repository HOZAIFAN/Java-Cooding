package DSA.StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class PrefixToInfix {
    public static String PrefixtoInfix(String data){
        String st=data;
        String t1;
        String t2;
        String conv;
        Stack<String> s=new Stack<>();
        char ch;
        for(int i=st.length()-1;i>=0;i--){
            ch=st.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                s.push(String.valueOf(ch));
            }else {
                t2=s.peek();
                s.pop();
                t1=s.peek();
                s.pop();
                conv='(' + t2+ ch+ t1+')';
                s.push(conv);
            }
        }
        return s.peek();
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Expression you want to covert:");
        String exp;
        exp=in.nextLine();
        System.out.print("The Converted Expression fron prefix to infix is :" + PrefixtoInfix(exp));
    }
}
