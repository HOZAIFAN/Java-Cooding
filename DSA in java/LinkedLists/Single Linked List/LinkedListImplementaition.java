package DSA.LinkedLists.DSA;

public class LinkedListImplementaition {
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    private Node head;

    // Add node at the beginning (Add First)
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add node at the end (Add Last)
    public void addLast(String data) {
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
    //delete first
    public void deletFirst(){
        if(head==null){
        System.out.println("The lis is empty" );
        return;
        }
        head = head.next;
    }
    //delete last
    public void deletLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondlast=secondlast.next;
        }

    }


    // Print linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) { // Fixing loop condition
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        DSA.LinkedLists.DSA.LinkedListImplementaition list = new DSA.LinkedLists.DSA.LinkedListImplementaition();
        list.addFirst("are");
        list.addFirst("how");
        list.addLast("you");// Fixed method name
        list.printList();
        list.deletFirst();
        list.printList();
        list.deletLast();
        list.printList();
    }
}
