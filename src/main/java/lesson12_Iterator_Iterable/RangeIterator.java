package lesson12_Iterator_Iterable;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {
    private Range range;
    private int position;

    public RangeIterator(Range range) {
        this.range = range;
        position = range.getFirst();
    }

    @Override
    public boolean hasNext() {
        if (position <= range.getLast())
            return true;
        return false;
    }

    @Override
    public Integer next() {
//        int current = position;
//        position++;
//        return current;
        return position++;
    }
}
