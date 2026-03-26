package lesson17_HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class Test_1 {


        private Map<String, Integer> map;

        @BeforeEach
        void setUp() {
            map = new HashMap<>();
        }
        @Test
        void testPut() {
            Map<String, Integer> map = new HashMap<>();

            Integer result = map.put("Jan", 1);

            assertNull(result); // раньше значения не было
            assertEquals(1, map.get("Jan"));
        }

    @Test
        void testPutOverwrite() {
            Map<String, Integer> map = new HashMap<>();
            map.put("Jan", 1);

            Integer oldValue = map.put("Jan", 100);

            assertEquals(1, oldValue);
            assertEquals(100, map.get("Jan"));
        }

    @Test
        void testPutIfAbsent() {
            Map<String, Integer> map = new HashMap<>();
            map.put("Jan", 100);

            Integer result = map.putIfAbsent("Jan", 1);

            assertEquals(100, result); // не заменилось
            assertEquals(100, map.get("Jan"));
        }

    @Test
        void testGetAndGetOrDefault() {
            Map<String, Integer> map = new HashMap<>();
            map.put("Apr", 4);

            assertNull(map.get("Aprrr"));
            assertEquals(10500, map.getOrDefault("Aprrr", 10500));
        }

    @Test
        void testRemove() {
            Map<String, Integer> map = new HashMap<>();
            map.put("Jul", 7);

            Integer removed = map.remove("Jul");

            assertEquals(7, removed);
            assertFalse(map.containsKey("Jul"));
        }

    @Test
        void testRemoveWithValue() {
            Map<String, Integer> map = new HashMap<>();
            map.put("Jul", 7);

            boolean result = map.remove("Jul", 10);

            assertFalse(result);
            assertTrue(map.containsKey("Jul"));
        }

    @Test
        void testReplace() {
            Map<String, Integer> map = new HashMap<>();
            map.put("Jul", 7);

            Integer oldValue = map.replace("Jul", 1000);

            assertEquals(7, oldValue);
            assertEquals(1000, map.get("Jul"));
        }

    @Test
        void testReplaceConditional() {
            Map<String, Integer> map = new HashMap<>();
            map.put("Jul", 1000);

            boolean result = map.replace("Jul", 1000, 2000);

            assertTrue(result);
            assertEquals(2000, map.get("Jul"));
        }

    @Test
        void testNullKeyAndValue() {
            Map<String, Integer> map = new HashMap<>();

            map.put(null, 1);
            map.put("Jul", null);

            assertEquals(1, map.get(null));
            assertNull(map.get("Jul"));
        }

    @Test
        void testIsEmpty() {
            Map<String, Integer> map = new HashMap<>();

            assertTrue(map.isEmpty());

            map.put("Jan", 1);

            assertFalse(map.isEmpty());
        }
    }


