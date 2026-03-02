package lesson11_MyArray;

import java.util.Comparator;

public class ComparatorInt implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 == null || o2 == null)
            return 0;
        return (int) o1 - (int) o2;
    }
}
