package DSA.StackAndQueues;

import java.io.Console;
import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Stack;

public class StackUsingCollection {
    

    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3 );
        s.push(4);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s);



    }
}
