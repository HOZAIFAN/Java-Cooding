public class DoubleLinkedListImplementation {
    // Node class only for structure
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    // Head of the doubly linked list
    Node head;

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
    }

    // Remove from beginning
    public void removeFirst() {
        if (head == null) {
            System.out.println("The LinkedList is empty");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    // Remove from end
    public void removeLast() {
        if (head == null) {
            System.out.println("The LinkedList is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        Node secondLast = currNode.prev;
        secondLast.next = null;
    }

    // Print list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " <-> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DoubleLinkedListImplementation dll = new DoubleLinkedListImplementation();

        dll.addFirst(4);   // List: 4
        dll.addLast(3);    // List: 4 <-> 3
        dll.removeFirst(); // List: 3
        dll.removeLast();  // List: empty
        dll.printList();   // Prints: List is empty
    }
}
