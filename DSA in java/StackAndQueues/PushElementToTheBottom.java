package DSA.StackAndQueues;

import java.util.Stack;

public class PushElementToTheBottom {
   public void PushAtBottom(int data, Stack<Integer> s){
       if (s.isEmpty()){
           s.push(data);
           return;
       }

       int top = s.pop();
       PushAtBottom(data,s);
       s.push(top);

   }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        PushElementToTheBottom bottom=new PushElementToTheBottom();
        s.push(1);
        s.push(2);
        s.push(3);
        bottom.PushAtBottom(0, s);
        System.out.println(s);
    }
}
