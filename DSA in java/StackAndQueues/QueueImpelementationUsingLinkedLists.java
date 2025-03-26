package DSA.StackAndQueues;

public class QueueImpelementationUsingLinkedLists {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node head = null;
        Node tail = null;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int data) {
            Node newnode = new Node(data);
            if (isEmpty()) {
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.print("The list is already Empty");
                return -1;
            }
            int headata = head.data;
            head = head.next;
            return headata;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.print("The list is already Empty");
            }
            return head.data;
        }
    }
    public static void main(String[] args){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
       System.out.print( q.peek());
    }
}


