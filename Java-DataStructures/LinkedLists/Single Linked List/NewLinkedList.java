package DSA.LinkedLists.DSA;

public class NLL {
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Add element to the beginning of the linked list
    public void addElementFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add element to the end of the linked list
    public void addElementLast(String data) {
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
    }

    // Print the linked list
    public void PrintList() {
        if (head == null) {
            System.out.println("The linked list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Delete first element
    public void deletFirst() {
        if (head == null) {
            System.out.println("The List is empty");
            return;
        }
        head = head.next;
    }

    // Delete last element
    public void deletlast() {
        if (head == null) {
            System.out.println("The List is empty");
            return;
        }
        if (head.next == null) {
            head = null; // Remove the only node
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            secondLast = lastNode;
            lastNode = lastNode.next;
        }

        secondLast.next = null; // Remove the last node
    }

    public static void main(String[] args) {
        NLL list = new NLL();
        list.addElementFirst("are");
        list.addElementFirst("how");
        list.addElementLast("you");
        list.PrintList();
        list.deletFirst();
        list.PrintList();

        list.deletlast();
        list.PrintList();
    }
}
