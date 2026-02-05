package lesson6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HW_RegExpIntrTest {


    @Test
     void testIsPositiveLessThen300() {
        assertTrue(HW_RegExpIntr.isPositiveLessThen300("1"));
        assertTrue(HW_RegExpIntr.isPositiveLessThen300("299"));
        assertTrue(HW_RegExpIntr.isPositiveLessThen300("99"));
        assertTrue(HW_RegExpIntr.isPositiveLessThen300("30"));

        assertFalse(HW_RegExpIntr.isPositiveLessThen300("300"));
        assertFalse(HW_RegExpIntr.isPositiveLessThen300("0"));
        assertFalse(HW_RegExpIntr.isPositiveLessThen300("-1"));
    }

    @Test
    public void matcherIsPositiveLessThanEquals255() {
        assertTrue(StringExpressions.isPositiveLessThanEquals255("255"));
        assertTrue(StringExpressions.isPositiveLessThanEquals255("1"));

        assertFalse(StringExpressions.isPositiveLessThanEquals255("256"));
        assertFalse(StringExpressions.isPositiveLessThanEquals255("0"));
    }
    @Test
     void isNumberTest() {
        assertTrue(StringExpressions.isNumber("4"));
        assertTrue(StringExpressions.isNumber("1342839795"));
        assertTrue(StringExpressions.isNumber("3.14"));
        assertTrue(StringExpressions.isNumber("43333.333"));
        assertTrue(StringExpressions.isNumber("-43333.333"));
        assertTrue(StringExpressions.isNumber("-4"));
        assertTrue(StringExpressions.isNumber("0"));
        assertTrue(StringExpressions.isNumber("0.2345"));
        assertTrue(StringExpressions.isNumber("-0.2345"));

        assertFalse(StringExpressions.isNumber("4..12"));
        assertFalse(StringExpressions.isNumber("4c12"));
        assertFalse(StringExpressions.isNumber("x12"));
        assertFalse(StringExpressions.isNumber("4 12"));
        assertFalse(StringExpressions.isNumber("4,12"));
        assertFalse(StringExpressions.isNumber("011"));
        assertFalse(StringExpressions.isNumber("-011"));
    }

    @Test
     void IsraelMobileTest() {
// right phone numbers
        assertTrue(StringExpressions.isIsraelMobile("054-1234567"));
        assertTrue(StringExpressions.isIsraelMobile("0541234567"));
        assertTrue(StringExpressions.isIsraelMobile("+97254-123-4567"));
        assertTrue(StringExpressions.isIsraelMobile("058-12-34-567"));
        assertTrue(StringExpressions.isIsraelMobile("0531234-567"));
// wrong phone numbers
        assertFalse(StringExpressions.isIsraelMobile("54-1234567"));
        assertFalse(StringExpressions.isIsraelMobile("054--12-4567"));
        assertFalse(StringExpressions.isIsraelMobile("+972054-123-4567"));
        assertFalse(StringExpressions.isIsraelMobile("97254-123-4567"));
        assertFalse(StringExpressions.isIsraelMobile("0052-1234567"));
    }

    @Test
    void testCheckCreditCardNumber()
    {
        assertTrue(HW_RegExpIntr.checkCreditCardNumber("12345678"));
        assertTrue(HW_RegExpIntr.checkCreditCardNumber("1234567890"));
        assertTrue(HW_RegExpIntr.checkCreditCardNumber("1234567887654321"));

        assertFalse(HW_RegExpIntr.checkCreditCardNumber("12345678876543210"));
        assertFalse(HW_RegExpIntr.checkCreditCardNumber("1234567"));
        assertFalse(HW_RegExpIntr.checkCreditCardNumber("123456780A"));
    }

    @Test
    void testCheckDateFormatEU()
    {
        assertTrue(HW_RegExpIntr.checkDateFormatEU("25.01.2020"));
        assertTrue(HW_RegExpIntr.checkDateFormatEU("05.11.2018"));

        assertFalse(HW_RegExpIntr.checkDateFormatEU("32.12.2020"));
        assertFalse(HW_RegExpIntr.checkDateFormatEU("12.15.2020"));
        assertFalse(HW_RegExpIntr.checkDateFormatEU("12/12/2020"));
        assertFalse(HW_RegExpIntr.checkDateFormatEU("2020.12.15"));
        assertFalse(HW_RegExpIntr.checkDateFormatEU("2020-12-15"));
        assertFalse(HW_RegExpIntr.checkDateFormatEU("5.11.2018"));
    }




}