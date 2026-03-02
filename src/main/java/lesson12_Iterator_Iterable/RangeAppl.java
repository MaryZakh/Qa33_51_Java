package lesson12_Iterator_Iterable;

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
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }


}



