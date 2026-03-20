package lesson15_Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetAppl {

    public static void main(String[] args) {
        //HashSet<Person>perSet = new HashSet<>();
        LinkedHashSet<Person> perSet = new LinkedHashSet<>();
        Person p2 = new Person(2222, "Masha", 22);
        Person p1 = new Person(1111, "Vasya", 32);
        Person p4 = new Person(4444, "Zina", 31);
        Person p3 = new Person(3333, "Grisha", 45);
        Person p5 = new Person(1111, "Vasya", 32);

        System.out.println(perSet.add(p1));
        perSet.add(p2);
        perSet.add(p3);
        perSet.add(p4);
        System.out.println(perSet);

        // System.out.println(perSet.remove(p1));
        System.out.println(perSet.add(p5));
        System.out.println(perSet);

        int age = 32;
        printAgeMore(perSet, age);

    }

    private static void printAgeMore(HashSet<Person> perSet, int age) {
        for (Person p : perSet) {
            if (p.getAge() >= age)
                System.out.println(p);
        }
    }


    //1,2,14,32,11,3,6,10

}
