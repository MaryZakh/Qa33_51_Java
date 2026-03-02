package lesson11_MyArray;

import java.util.Iterator;

public class MyArrayIterator2 implements Iterator<Object> {
    private Object[] array;
    private int position;

    public MyArrayIterator2(Object[] array) {
        this.array = array;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if (position < array.length)
            return true;
        return false;
    }

    @Override
    public Object next() {
        return array[position++];
    }
}
