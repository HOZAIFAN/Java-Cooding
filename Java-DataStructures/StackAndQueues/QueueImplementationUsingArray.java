package DSA.StackAndQueues;

public class QueueImplementationUsingArray {
    static class Queue {
        private int arr[];
        private int size;
        private int rear;
        private int front;
        private int cursize;

        // Constructor
        public Queue(int n) {
            this.size = n;
            this.arr = new int[size];
            this.rear = -1;
            this.front = 0;
            this.cursize = 0;
        }

        // Check if queue is empty
        public boolean isEmpty() {
            return cursize == 0;
        }

        // Check if queue is full
        public boolean isFull() {
            return cursize == size;
        }

        // Enqueue (add an element)
        public void add(int data) {
            if (isFull()) {
                System.out.println("The queue is full. Cannot add " + data);
                return;
            }
            rear = (rear + 1) % size; // Circular increment
            arr[rear] = data;
            cursize++;
        }

        // Dequeue (remove an element)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot remove.");
                return -1;
            }
            int frontElement = arr[front];
            front = (front + 1) % size; // Circular increment
            cursize--;
            return frontElement;
        }

        // Peek (get front element without removing)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5); // Create a queue of size 5

        // Adding elements
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        // Trying to add when queue is full
        q.add(60); // Should print "The queue is full"

        // Display and remove elements
        while (!q.isEmpty()) {
            System.out.println("Front: " + q.peek());
            System.out.println("Removed: " + q.remove());
        }

        // Trying to remove when queue is empty
        q.remove(); // Should print "Queue is empty"
    }
}
