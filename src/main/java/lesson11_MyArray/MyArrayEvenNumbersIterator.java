package lesson11_MyArray;

import java.util.Iterator;

public class MyArrayEvenNumbersIterator implements Iterator<Integer> {
    private MyArray array;
    private int position;

    public MyArrayEvenNumbersIterator(MyArray array) {
        this.array = array;
        position = searchNextEvenIndex(0);
    }

    private int searchNextEvenIndex(int index) {
        for (int i = index; i <array.size(); i++) {
            if((Integer)array.get(i)%2 ==0)
                return i;
        }
        return array.size();
    }

    @Override
    public boolean hasNext() {
        return position<array.size();
    }

    @Override
    public Integer next() {
        Integer res = (Integer) array.get(position);
        position = searchNextEvenIndex(position+1);
        return res;
    }
}
