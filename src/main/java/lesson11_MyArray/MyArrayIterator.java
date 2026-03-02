package lesson11_MyArray;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Object> {
    private MyArray array;
    private int position;

    public MyArrayIterator(MyArray array) {
        this.array = array;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if (position < array.size())
            return true;
        return false;
    }

    @Override
    public Object next() {
        Object res = array.get(position++);
        return res;
    }
}
