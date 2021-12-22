package DoublyLinkedList;

public class Node {




    int data;
    Node prev;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;

    }
}

