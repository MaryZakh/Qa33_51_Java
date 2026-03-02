package lesson12_Iterator_Iterable;

import java.util.Iterator;

public class Range implements Iterable<Integer> {

    private int first;
    private int last;

    public Range(int first, int last) {
        this.first = first;
        this.last = last;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(this);
    }
}
