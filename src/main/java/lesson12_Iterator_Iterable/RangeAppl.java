package lesson12_Iterator_Iterable;

import java.util.Date;
import java.util.Iterator;

public class RangeAppl {

    public static void main(String[] args) {

        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : ar) {
            System.out.print(i + " ");
        }
        System.out.println();

        int first = -15, last = 20;

        Range range = new Range(first, last);
        for (int i : range) {
            System.out.print(i + " ");
        }
        System.out.println();
        //==================================
        RangeIterator iterator = new RangeIterator(range);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        //=======================================
        Iterator<Integer> iterRev = new RangeReverseIterator(range);
        while (iterRev.hasNext()) {
            System.out.print(iterRev.next() + " ");
        }
        System.out.println();
        //=======================================
        Iterator<Double> iterRev2 = new RangeReverseHalfIterator(range);
        while (iterRev2.hasNext()) {
            System.out.print(iterRev2.next() + " ");
        }
        System.out.println();
    }

}



