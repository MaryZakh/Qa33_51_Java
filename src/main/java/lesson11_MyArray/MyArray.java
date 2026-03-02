package lesson11_MyArray;


import java.util.Arrays;
import java.util.Comparator;


public class MyArray implements IMyArray {
    private static final int INITIAL_SIZE = 16;
    private Object[] array;
    private int size = 0;

    public MyArray(int initialSize) {
        if (initialSize <= 0)
            array = new Object[INITIAL_SIZE];
        else
            array = new Object[initialSize];
    }

    public MyArray() {
//		array = new Object[INITIAL_SIZE];
        this(INITIAL_SIZE);
    }

    // =================================
    @Override
    public boolean add(Object obj) {
        if (obj == null)
            return false;
        if (size == array.length)
            allocateArray();
        array[size++] = obj;
        return true;
    }

    private void allocateArray() {
        array = Arrays.copyOf(array, array.length * 2);

    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size)
            return null;
        return array[index];
    }

    @Override
    public boolean add(int index, Object obj) {
        if (obj == null || index < 0 || index > size)
            return false;
        if (index == size)
            return add(obj);
        if (size == array.length)
            allocateArray();
        System.arraycopy(array, index, array, index + 1, size - index);
        // ar1->[23][12][10][5] ar2->[1][2][23][12][]
        array[index] = obj;
        size++;
        return true;
    }

    // 1 2 3 4 [] [] [] []
    @Override
    public int size() {
        return size;
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size)
            return null;
        Object res = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[size] = null;
        size--;
        return res;
    }

    @Override
    public boolean remove(Object obj) {
        if (obj == null)
            return false;
        int resInd = indexOf(obj);
        Object temp = remove(resInd);
//		return temp != null ? true : false;
        return temp != null;
    }

    @Override
    public int indexOf(Object obj) {
        if (obj == null)
            return -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(obj))
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        if (obj == null)
            return -1;
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(obj))
                return i;
        }
        return -1;
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }


    @Override
    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }

    @Override
    public void sort(Comparator<Object> comp) {
        if (comp == null)
            return;
        Arrays.sort(array, comp);
    }

    @Override
    public boolean addAll(MyArray other) {
        if (other == null || other.size == 0)
            return false;

        for (int i = 0; i < other.size; i++) {
            add(other.get(i));
        }
        return true;
    }

    @Override
    public boolean removeAll(MyArray other) {
        if (other == null || other.size == 0)
            return false;

        int oldSize = size;
        int ind;
        for (int i = 0; i < other.size; i++) {
            ind = indexOf(other.get(i));
            if (ind >= 0)
                remove(ind);
        }
        return oldSize != size;
    }


}


