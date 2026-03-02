package lesson11_MyArray;

import java.util.Iterator;

public class MyArrayReverseIterator implements Iterator<Object> {
    private MyArray array;
    private int position;

    public MyArrayReverseIterator(MyArray array) {
        this.array = array;
        position = array.size() - 1;
    }

    @Override
    public boolean hasNext() {
        if (position >= 0)
            return true;
        return false;
    }

    @Override
    public Object next() {
        Object res = array.get(position);
        position -= 2;
        return res;
    }
}
