package lesson14_MyLinkedList;

import java.util.Comparator;
import java.util.Iterator;

public class MyLinkedList implements IList {
    int size;
    Node head;
    Node tail;

    @Override
    public boolean add(Object obj) {
        Node node = new Node(obj, tail, null);
        if (tail == null)
            head = node;
        else
            tail.next = node;
        tail = node;
        size++;
        return true;
    }

    @Override
    public Object get(int index) {
        Node node = getNodeByIndex(index);
        return node.data;
    }

    private Node getNodeByIndex(int index) {
        if (index < 0 || index >= size)
            return null;

        Node current;
        if (index <= size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

        } else
            current = tail;
        for (int i = size - 1; i > index; i--) {
            current = current.prev;
        }
        return current;
    }

    @Override
    public boolean add(int index, Object obj) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }

    @Override
    public int indexOf(Object obj) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object obj) {
        return 0;
    }

    @Override
    public boolean contains(Object obj) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void sort(Comparator<Object> comp) {

    }

    @Override
    public Iterator<Object> iterator() {
        return null;
    }
}
