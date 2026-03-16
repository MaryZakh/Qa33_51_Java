package lesson14_MyLinkedList;

import java.util.Iterator;

public class LinkedListIterator implements Iterator<Object> {
    Node current;

    public LinkedListIterator(Node node) {
        this.current = node;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Object next() {
        Object obj = current.data;
        current = current.next;
        return obj;
    }
}
