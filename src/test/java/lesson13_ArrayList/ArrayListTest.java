package lesson13_ArrayList;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    String[] strs = {"Ananas", "Kiwi", "Apple", "Grape", "Mango"};
    ArrayList<String> arList;


    @BeforeEach
    void setUp() {
//        arList = new ArrayList<>();
//        for (String str : strs) {
//            arList.add(str);
//        }
        arList = new ArrayList<>(Arrays.asList(strs));
    }


    @Test
    void testMethods() {
        assertFalse(arList.isEmpty());
        assertEquals(strs.length, arList.size());

        assertTrue(arList.add("Kiwi"));
        assertEquals(strs.length + 1, arList.size());
        assertNotEquals(arList.indexOf("Kiwi"), arList.lastIndexOf("Kiwi"));

        assertTrue(arList.add(null));
        assertEquals(strs.length + 2, arList.size());
        assertTrue(arList.contains(null));

        assertEquals("Ananas", arList.get(0));
    }

    @Test
    void testAdd() {
        arList.add(0, "Pear");
        assertEquals(strs.length + 1, arList.size());
        assertEquals("Pear", arList.get(0));
        assertEquals("Ananas", arList.get(1));

        String[] arS = {"Hello", "world"};
        ArrayList<String> test = new ArrayList<>(Arrays.asList(arS));
        assertTrue(arList.addAll(test));
        assertEquals(strs.length + 3, arList.size());
        assertTrue(arList.contains("Hello"));
        assertTrue(arList.contains("world"));
        assertTrue(arList.containsAll(test));

        assertTrue(arList.addAll(0, test));
        assertEquals(strs.length + 5, arList.size());
        assertEquals("Hello", arList.get(0));
        assertEquals("world", arList.get(1));
        assertEquals("Pear", arList.get(2));
    }

    @Test
    void testRemove() {
        assertEquals("Ananas", arList.remove(0));
        assertEquals(strs.length - 1, arList.size());
        assertFalse(arList.contains("Ananas"));
        // assertNull(arList.remove(-1));

        assertTrue(arList.remove("Kiwi"));
        assertEquals(strs.length - 2, arList.size());
        assertFalse(arList.contains("Kiwi"));

        assertFalse(arList.remove(null));

        String[] arS = {"Hello", "world"};
        ArrayList<String> test = new ArrayList<>(Arrays.asList(arS));

        assertTrue(arList.addAll(test));
        assertTrue(arList.containsAll(test));

        assertTrue(arList.removeAll(test));
        assertFalse(arList.containsAll(test));

        assertFalse(arList.removeAll(test));


        assertTrue(arList.retainAll(test));
        assertTrue(arList.isEmpty());

    }

    @Test
    void testSetAndClear() {
        //String[] strs = {"Ananas", "Kiwi", "Apple", "Grape", "Mango"};
        assertEquals("Kiwi", arList.set(1, "Super Kiwi"));
        assertEquals("Super Kiwi", arList.get(1));

        arList.clear();
        assertTrue(arList.isEmpty());
    }

    @Test
    void testSublist() {
        List<String> res = arList.subList(0, 2);
        assertEquals(2, res.size());
        assertTrue(arList.contains("Ananas"));
        assertTrue(arList.contains("Kiwi"));


        assertTrue(res.remove("Kiwi"));
        assertFalse(arList.contains("Kiwi"));
        List<String> res2 = new ArrayList<String>(res);
        assertTrue(arList.contains("Ananas"));
        assertTrue(res2.remove("Ananas"));
        assertTrue(arList.contains("Ananas"));
    }

    @Test
    void testSort() {
        Collections.sort(arList);
        // System.out.println(arList);
        String[] res = {"Ananas", "Apple", "Grape", "Kiwi", "Mango"};
        assertArrayEquals(res, arList.toArray());

        arList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        String[] res2 = {"Mango", "Kiwi", "Grape", "Apple", "Ananas"};
        assertArrayEquals(res2, arList.toArray());
    }

    @Test
    void testRemoveIf(){
        assertTrue(arList.removeIf(new StringLengthPredicate()));
        assertEquals(strs.length-1, arList.size());
        assertFalse(arList.contains("Ananas"));
    }

}