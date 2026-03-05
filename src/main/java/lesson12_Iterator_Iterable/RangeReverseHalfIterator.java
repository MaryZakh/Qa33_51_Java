package lesson12_Iterator_Iterable;

import java.util.Iterator;

public class RangeReverseHalfIterator implements Iterator<Double> {
    private Range range;
    private double position;


    public RangeReverseHalfIterator(Range range) {
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
    public Double next() {
        Double res = position;
        position-=0.5;
        return res;
    }
}
