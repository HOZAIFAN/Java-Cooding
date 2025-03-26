package DSA.StackAndQueues;

import java.awt.*;
import java.util.Scanner;
import java.util.Stack;

public class PostfixToInfix {
    public static String PostfixtoInfix(String data){
        String st=data;
        String t1;
        String t2;
        String conv;
        Stack<String> s=new Stack<>();
        char ch;
        for(int i=0;i<st.length();i++){
            ch=st.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                s.push(String.valueOf(ch));
            }else {
                t1=s.peek();
                s.pop();
                t2=s.peek();
                s.pop();
                conv='(' + t1+ ch+ t2+')';
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
        System.out.print("The Converted Expression fron postfix to infix is :" + PostfixtoInfix(exp));
    }

}
