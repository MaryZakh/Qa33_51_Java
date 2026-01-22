package lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnitMethods {

    @Test
    void test() {
        assertEquals(4, 2 + 2);
        assertEquals(3.14, 2.0 + 1.14, 0.00001);
        assertEquals("Hello", "He" + "llo");
        String str = null;
        assertNull(str);
        str = "";
        assertNotNull(str);
        int[] ar1 = {1, 2, 3, 4, 5, 6};
        int[] ar2 = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(ar1, ar2);
        assertTrue(5 == 2 + 3);
        assertFalse(6 == 2 + 3);
    }


    @Test
    void arrayEvenSumTest() {
        String[] nums = {"3", "10", "0", "1", "20", "6"};
        Integer res = ArraysMethods.arrayEvenSum(nums);
        assertEquals(36, (int) res);

        String[] nums2 = {"1", "3", "11", "5"};
        res = ArraysMethods.arrayEvenSum(nums2);
        assertEquals(0,(int)res);

        //=========Negative========
        res = ArraysMethods.arrayEvenSum(null);
        assertNull(res);

        String[]nums3 = {};
        res = ArraysMethods.arrayEvenSum(nums3);
        assertNull(res);
    }

}