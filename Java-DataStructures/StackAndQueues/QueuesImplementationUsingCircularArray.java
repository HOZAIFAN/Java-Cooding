package DSA.StackAndQueues;

public class QueuesImplementationUsingCircularArray {

    public static class Queue {
        private int size;
        private int[] arr;
        private int rear;
        private int front;

        // Constructor
        public Queue(int n) {
            this.size = n;
            this.arr = new int[size];
            this.rear = -1;
            this.front = -1;
        }

        // Check if queue is empty
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // Check if queeu is full
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add (enqueue) an element
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full. Cannot add " + data);
                return;
            }
            // If queue is empty, set front = 0
            if (front == -1) {
                front = 0;
            }
            // Move rear forward circularly
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove (dequeue) an element
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot remove.");
                return -1;
            }
            int result = arr[front]; // Get the front element
            // If only one element is left, reset the queue
            if (rear == front) {
                front = rear = -1; // Reset queue
            } else {
                front = (front + 1) % size; // Move front forward circularly
            }
            return result;
        }

        // Get front element without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5); // Creating a queue of size 5

        // Adding elements
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        // Trying to add an element when queue is full
        q.add(60); // This should print "Queue is full"

        // Display and remove elements
        while (!q.isEmpty()) {
            System.out.println("Front: " + q.peek());
            System.out.println("Removed: " + q.remove());
        }

        // Trying to remove an element when queue is empty
        q.remove(); // This should print "Queue is empty"
    }
}
