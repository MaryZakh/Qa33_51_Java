package lesson14_MyLinkedList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList implements IList {
    int size;
    Node head;
    Node tail;


    @Override
    public Iterator<Object> iterator() {
        return new LinkedListIterator(head);
    }

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
        return node !=null ? node.data :null;
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

        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    @Override
    public boolean add(int index, Object obj) {
        if (index < 0 || index >= size)
            return false;
        if (index == size - 1)
            return add(obj);
        else {
            Node current = getNodeByIndex(index);
            Node newNode = new Node(obj, current.prev, current);
            if (current.prev != null) {
                current.prev.next = newNode;
            } else {
                head = newNode;
            }
            current.prev = newNode;
            size++;

        }
        return true;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size)
            return null;
        Node node = getNodeByIndex(index);
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
        size--;
        return node.data;
    }

    @Override
    public boolean remove(Object obj) {
        int index = indexOf(obj);
        Object res = remove(index);
        return res == null ? false : true;
    }

    @Override
    public int indexOf(Object obj) {
        int index = 0;
        if (obj == null) {
            for (Node current = head; current != null; current = current.next) {
                if (current.data == null)
                    return index;
                index++;
            }
        } else {
            for (Node current = head; current != null; current = current.next) {
                if (obj.equals(current.data))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        int index = size - 1;
        if (obj == null) {
            for (Node current = tail; current != null; current = current.prev) {
                if (current.data == null)
                    return index;
                index--;
            }
        } else {
            for (Node current = tail; current != null; current = current.prev) {
                if (obj.equals(current.data))
                    return index;
                index--;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node current = head;
        int i = 0;
        while (current != null) {
            array[i++] = current.data;
            current = current.next;
        }
        return array;
    }

    @Override
    public void sort(Comparator<Object> comp) {
        Object[] temp = toArray();
        Arrays.sort(temp, comp);
        clear();
        for (Object o : temp) {
            add(o);
        }
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }


}
