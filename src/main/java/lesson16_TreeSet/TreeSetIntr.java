package lesson16_TreeSet;

import java.util.TreeSet;

public class TreeSetIntr {

    public static void main(String[] args) {
        //TreeSet<Cat>cats = new TreeSet<>(new CatComparator());
        TreeSet<Cat> cats = new TreeSet<>();
        System.out.println(cats.add(new Cat(12, "Murzik", "Yellow")));
        cats.add(new Cat(10, "Marusya", "White"));
        cats.add(new Cat(15, "Petr", "Black"));
        System.out.println(cats.add(new Cat(4, "Barsik", "Black")));
        System.out.println(cats.add(new Cat(3, "Barsik", "Black")));
        cats.add(new Cat(17, "Begemot", "White/Black"));

        for (Cat cat:cats){
            System.out.println(cat);
        }
        System.out.println("===========================");
        System.out.println(cats.first());
        System.out.println(cats.last());
        System.out.println("===========================");
        System.out.println( cats.subSet(new Cat(10,"Marusya","White"),new Cat(15,"Petr","Black")));
        System.out.println("===========================");
        System.out.println( cats.subSet(new Cat(10,"Marusya","White"),true, new Cat(15,"Petr","Black"),true));

    }
}
