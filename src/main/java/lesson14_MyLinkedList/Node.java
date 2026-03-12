package lesson14_MyLinkedList;

public class Node {
    Object data;
    Node prev;
    Node next;

    public Node(Object data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
