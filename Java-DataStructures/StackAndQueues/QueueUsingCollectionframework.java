package DSA.StackAndQueues;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingCollectionframework {
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        // Display and remove elements
        while (!q.isEmpty()) {
            System.out.println( q.peek());
            System.out.println("Removed: " + q.remove());
        }
    }
}





