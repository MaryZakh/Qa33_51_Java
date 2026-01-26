package lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HW_MyMethodTest {
    @Test
    void testCalculatorPositive() {
        assertEquals(12.6, HW_MyMethod.calculator(6.3, 6.3, "+"), 0.00001);
        assertEquals(0, HW_MyMethod.calculator(6.3, 6.3, "-"), 0.00001);
        assertEquals(12.6, HW_MyMethod.calculator(6.3, 2, "*"), 0.00001);
        assertEquals(1., HW_MyMethod.calculator(6.3, 6.3, "/"), 0.00001);
    }

    @Test
    void testCalculatorNegative() {
        assertNull(HW_MyMethod.calculator(-2.,12.,"#"));
        assertNull(HW_MyMethod.calculator(-2.,12.,""));
    }

}