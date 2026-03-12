package lesson14_MyLinkedList;

import lesson11_MyArray.MyArray;

import java.util.Comparator;

public interface IList extends Iterable<Object>{
    boolean add(Object obj);
    Object get(int index);
    boolean add(int index, Object obj);
    int size();
    Object remove(int index);
    boolean remove(Object obj);
    int indexOf(Object obj);
    int lastIndexOf(Object obj);
    boolean contains(Object obj);
    Object[] toArray();
    void sort(Comparator<Object> comp);
//    boolean addAll(MyArray other);
//    boolean removeAll(MyArray other);

}
