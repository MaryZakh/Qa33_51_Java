package lesson15_Sets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetApplTest {
    Set<Integer> set = new LinkedHashSet<>();
    Integer[] ar = {5, 2, 3, 7, 1, 6, 4};
//Add, remove, contains, addAll, containsAll, removeAll,
//retainAll, toArray

    @BeforeEach
    void setUp() {
        //set.addAll(Arrays.asList(ar));
        for (Integer num : ar) {
            set.add(num);
        }
    }

    @Test
    void testAdd() {
        int n = 10;
        Integer[] exp = {5, 2, 3, 7, 1, 6, 4, 10};
        assertTrue(set.add(n));
        assertEquals(exp.length, set.size());
        assertTrue(set.containsAll(Arrays.asList(exp)));

        assertTrue(set.add(null));
        assertEquals(exp.length + 1, set.size());
        assertTrue(set.contains(null));

        assertFalse(set.add(10));
        assertEquals(exp.length + 1, set.size());
    }

    @Test
    void testAddAll() {
        Integer[] temp = {12, 34, 90};
        Integer[] exp = {5, 2, 3, 7, 1, 6, 4, 12, 34, 90};
        assertTrue(set.addAll(Arrays.asList(temp)));
        assertEquals(exp.length, set.size());
        assertTrue(set.containsAll(Arrays.asList(exp)));

        Integer[] temp2 = {12, 34, 90, 50};
        assertTrue(set.addAll(Arrays.asList(temp2)));
        assertEquals(exp.length + 1, set.size());
        assertTrue(set.contains(50));

        Integer[] temp3 = {12, 34, 90, 50};
        assertFalse(set.addAll(Arrays.asList(temp3)));
        assertEquals(exp.length + 1, set.size());

        //set.addAll(null);
    }

    @Test
    void testRemove() {
        // Integer[] ar = {5, 2, 3, 7, 1, 6, 4};
        int n = 5;
        assertTrue(set.contains(n));
        assertTrue(set.remove(n));
        assertEquals(ar.length - 1, set.size());
        assertFalse(set.contains(n));

        assertFalse(set.remove(n));
        assertEquals(ar.length - 1, set.size());

        assertFalse(set.remove(null));
    }

    @Test
    void removeAll() {
        Integer[] exp = {5, 2, 6, 4};
        Integer[] temp = {3, 7, 1};
        assertTrue(set.removeAll(Arrays.asList(temp)));
        assertEquals(exp.length, set.size());
        assertTrue(set.containsAll(Arrays.asList(exp)));

        Integer[] temp2 = {6, 8, 12, 400};
        assertTrue(set.removeAll(Arrays.asList(temp2)));
        assertEquals(exp.length - 1, set.size());
        assertFalse(set.contains(6));
        assertFalse(set.removeAll(Arrays.asList(temp2)));
        assertEquals(exp.length - 1, set.size());
    }

    @Test
    void testRetainAll() {
        // Integer[] ar = {5, 2, 3, 7, 1, 6, 4};
        Integer[] temp = {3, 7, 1};
        assertTrue(set.retainAll(Arrays.asList(temp)));
        assertEquals(temp.length, set.size());
        assertTrue(set.containsAll(Arrays.asList(temp)));

        assertFalse(set.retainAll(Arrays.asList(temp)));
        assertEquals(temp.length, set.size());
        assertTrue(set.containsAll(Arrays.asList(temp)));

        Integer[] temp2 = {13, 17, 11};
        assertTrue(set.retainAll(Arrays.asList(temp2)));
        assertTrue(set.isEmpty());
    }

    @Test
    void testToArray(){
        Object[]arr =  set.toArray();
        for (int i = 0; i < ar.length; i++) {
            assertTrue(set.contains(ar[i]));
        }
    }

    @Test
    void testContains(){
        // Integer[] ar = {5, 2, 3, 7, 1, 6, 4};
        assertTrue(set.contains(3));
        int n = 15;
        assertTrue(set.add(n));
        assertTrue(set.contains(n));

    }

    @Test
    void testContainAll(){
        Integer[]temp = {30,40,50};
        assertTrue(set.addAll(Arrays.asList(temp)));
        assertTrue(set.containsAll(Arrays.asList(temp)));
    }

}