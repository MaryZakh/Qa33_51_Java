package lesson17_HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MapIntroTests {
    HashMap<String, Integer> calendar;

    @BeforeEach
    void setUp() {
        calendar = new HashMap<>();
        calendar.put("January", 31);
        calendar.put("February", 28);
        calendar.put("March", 31);
        calendar.put("April", 30);
    }

    @Test
    void testPut() {
        assertEquals(4, calendar.size());
        assertEquals(31, calendar.get("January"));

        assertNull(calendar.put("May", 31));
        assertEquals(5, calendar.size());
        assertEquals(31, calendar.get("May"));

        assertEquals(31, calendar.put("May", 131));
        assertEquals(5, calendar.size());
        assertEquals(131, calendar.get("May"));

        assertNull(calendar.put("June", null));
        assertEquals(6, calendar.size());
        assertEquals(null, calendar.get("June"));

        assertNull(calendar.put(null, null));
        assertEquals(7, calendar.size());
        assertNull(calendar.get(null));
    }


    @Test
    void testPutIfAbsent() {
        assertNull(calendar.putIfAbsent("May", 31));
        assertEquals(5, calendar.size());
        assertEquals(31, calendar.get("May"));

        assertEquals(31, calendar.putIfAbsent("May", 131));
        assertEquals(5, calendar.size());
        assertNotEquals(131, calendar.get("May"));

        assertNull(calendar.putIfAbsent(null, null));
        assertEquals(6, calendar.size());
        assertNull(calendar.get(null));

        assertNull(calendar.putIfAbsent(null, 12345));
        System.out.println(calendar.get(null));
        assertNotNull(calendar.get(null));

        assertNull(calendar.putIfAbsent("July", null));
        assertEquals(7, calendar.size());
        assertNull(calendar.putIfAbsent("July", 222));
        assertEquals(7, calendar.size());
        assertNotNull(calendar.get("July"));
    }

    @Test
    void testRemoveByKey() {
        assertEquals(31, calendar.remove("January"));
        assertEquals(3, calendar.size());

        assertNull(calendar.remove("January"));
        assertEquals(3, calendar.size());
        assertNull(calendar.get("January"));
    }

    @Test
    void testRemoveByKeyAndValue() {
        assertTrue(calendar.remove("January", 31));
        assertEquals(3, calendar.size());

        assertFalse(calendar.remove("February", 29));
        assertEquals(3, calendar.size());

        assertFalse(calendar.remove("May", 31));
        assertEquals(3, calendar.size());
    }

    @Test
    void testReplace() {
        assertNull(calendar.putIfAbsent("May", 20));
        assertEquals(20, calendar.replace("May", 31));
        assertEquals(31, calendar.get("May"));

        assertNull(calendar.replace("June", 12));
        assertEquals(5, calendar.size());

        assertNull(calendar.get("June"));
    }

    @Test
    void testReplaceWitOldValue() {
        assertNull(calendar.putIfAbsent("May", 20));
        assertFalse(calendar.replace("May", 19, 31));
        assertEquals(20, calendar.get("May"));

        assertTrue(calendar.replace("May", 20, 31));
        assertEquals(31, calendar.get("May"));
    }

    @Test
    void testContainsKey() {
        assertTrue(calendar.containsKey("January"));

        assertFalse(calendar.containsKey("May"));
        assertFalse(calendar.containsKey(null));
    }


    @Test
    void testContainsValue() {
        assertTrue(calendar.containsValue(31));

        assertFalse(calendar.containsValue(20));
        assertFalse(calendar.containsValue(null));
    }

    @Test
    void testGet(){
        assertEquals(31,calendar.get("January"));

        assertNull(calendar.get("May"));
        assertNull(calendar.get(null));
    }

    @Test
    void testGetOrDefault(){
        assertEquals(31,calendar.getOrDefault("January",1000));

        assertEquals(1000,calendar.getOrDefault("May",1000));
    }

    @Test
    void testIterationOverMap(){
        Collection<Integer> colValue = calendar.values();
        int[] days = {31,28,31,30};
        assertEquals(days.length,colValue.size());
        for(int day:days){
            assertTrue(colValue.contains(day));
        }
    }
}