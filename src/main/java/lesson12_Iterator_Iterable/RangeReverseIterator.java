package lesson12_Iterator_Iterable;

import java.util.Iterator;

public class RangeReverseIterator implements Iterator<Integer> {
    private Range range;
    private int position;


    public RangeReverseIterator(Range range) {
        this.range = range;
        position = range.getLast();
    }

    @Override
    public boolean hasNext() {
        if (position >= range.getFirst())
            return true;
        return false;
    }

    @Override
    public Integer next() {
        return position--;
    }
}
