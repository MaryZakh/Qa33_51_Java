package lesson14_MyLinkedList;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    MyLinkedList numbers;
    MyLinkedList strings;
    Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};
    String[] arStrings = {"abc", "lmn", "po", "abc"};

    @BeforeEach
    void setUp() throws Exception {
        numbers = new MyLinkedList();
        for (Integer num : arNumbers) {
            numbers.add(num);
        }
        strings = new MyLinkedList();
        for (String str : arStrings) {
            strings.add(str);
        }
    }

    @Test
    void testAddObject() {
        int sizeNumbers = numbers.size();
        int sizeStrings = strings.size();
        assertEquals(arNumbers.length, sizeNumbers);
        assertEquals(arStrings.length, sizeStrings);
        for (int i = 0; i < arNumbers.length; i++) {
            assertEquals(arNumbers[i], numbers.get(i));
        }
        for (int i = 0; i < arStrings.length; i++) {
            assertEquals(arStrings[i], strings.get(i));
        }
        assertTrue(numbers.add(null));
        sizeNumbers = numbers.size();
        assertEquals(arNumbers.length + 1, sizeNumbers);

        assertTrue(numbers.add("Cat"));
        assertEquals(arNumbers.length + 1, sizeNumbers);
    }

    @Test
    void testGet() {
        assertEquals(10, numbers.get(0));
        assertEquals(2000, numbers.get(numbers.size() - 1));
        assertNull(numbers.get(-1));
        assertNull(numbers.get(numbers.size()));
    }

    @Test
    void testAddIndexObject() {
        int value = 100;
        int index = 0;
        assertTrue(numbers.add(index, value));
        assertEquals(arNumbers.length + 1, numbers.size());
        assertEquals(100, numbers.get(index));
        Integer[] numExp = {100, 10, 7, 11, -2, 13, 10, 2000};
        assertArrayEquals(numExp, numbers.toArray());

        assertFalse(numbers.add(-1, 123));
        assertArrayEquals(numExp, numbers.toArray());

        assertFalse(numbers.add(numbers.size() + 1, 123));
        assertArrayEquals(numExp, numbers.toArray());

        assertTrue(numbers.add(1, null));
        Integer[] numExp2 = {100, null, 10, 7, 11, -2, 13, 10, 2000};
        assertArrayEquals(numExp2, numbers.toArray());
    }

    @Test
    void testSize() {
        assertEquals(arNumbers.length, numbers.size());
        assertTrue(numbers.add(678));
        assertEquals(arNumbers.length + 1, numbers.size());
        assertTrue(numbers.remove((Integer) 678));
        assertEquals(arNumbers.length, numbers.size());
    }

    @Test
    void testRemoveInt() {
        int index = 0;
        Integer[] arExp = {7, 11, -2, 13, 10, 2000};
        assertEquals(10, numbers.remove(index));
        assertArrayEquals(arExp, numbers.toArray());

        assertNull(numbers.remove(-1));
        assertArrayEquals(arExp, numbers.toArray());

    }

    @Test
    void testRemoveObject() {
        Integer[] arExp = {10, 7, 11, 13, 10, 2000};
        Integer value = -2;
        assertTrue(numbers.remove(value));
        assertArrayEquals(arExp, numbers.toArray());

        value = 8;
        assertFalse(numbers.remove(value));
        assertArrayEquals(arExp, numbers.toArray());
        assertFalse(numbers.remove(null));
        assertArrayEquals(arExp, numbers.toArray());
    }

    @Test
    void testContains() {
        // Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};
        assertTrue(numbers.contains(arNumbers[0]));

        assertFalse(numbers.contains(100500));
        assertFalse(numbers.contains(null));
    }

    @Test
    void testIndexOf() {
        assertEquals(0, numbers.indexOf(10));

        assertEquals(-1, numbers.indexOf(100500));
        assertEquals(-1, numbers.indexOf(null));
    }

    @Test
    void testLastIndexOf() {
        assertEquals(arNumbers.length - 2, numbers.lastIndexOf(10));

        assertEquals(-1, numbers.indexOf(100500));
        assertEquals(-1, numbers.indexOf(null));
    }

    @Test
    void testToArray() {
        assertArrayEquals(arNumbers, numbers.toArray());
    }

    @Test
    void testSort() {
        // Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};
        Integer[] arExp1 = {-2, 7, 10, 10, 11, 13, 2000};
        numbers.sort(new ComparatorInt());
        assertArrayEquals(arExp1, numbers.toArray());

        numbers.sort(null);
        assertArrayEquals(arExp1, numbers.toArray());

    }


    @Test
    void testIterable() {
//        Integer[] arExp1 = {10, 7, 11, -2, 13, 10, 2000};
//        int i = 0;
//        for (Object num : numbers) {
//            assertEquals(arExp1[i++], num);
        //==========================
    }
}