package DSA.StackAndQueues;
import java.util.Stack;
public class ReversIngStack {
    public static void PushAtBottom(int data, Stack<Integer> s){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(data,s);
        s.push(top);
    }
    public static  void Reverse(Stack<Integer> s) {
        if(s.isEmpty()) {
        return;
        }
        int top=s.pop();
        Reverse(s);
        PushAtBottom(top , s);

    }

    public static void main(String[] args){
        Stack<Integer> s= new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        PushAtBottom(0, s);//expected out put [0, 1, 2, 3]
        Reverse(s);//expected out put [3, 2, 1, 0]
        System.out.println(s);
    }
}

