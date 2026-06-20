package DSA.LinkedLists.CircularLinkedList;

public class CircularLinkedListImplemetation {
    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Delete from beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    // Delete from end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    // Main method to test
    public static void main(String[] args) {
        CircularLinkedListImplemetation cll = new CircularLinkedListImplemetation();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);

        cll.display();  // 10 -> 20 -> 30 -> 40 -> (head)

        cll.deleteFromBeginning();
        cll.display();  // 20 -> 30 -> 40 -> (head)

        cll.deleteFromEnd();
        cll.display();  // 20 -> 30 -> (head)
    }
}
