package lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HW_StringMethodsTest {

    @Test
    void testStringReverse() {
        HW_StringMethods.printStringReverse("Mama myla ramu");
        HW_StringMethods.printStringReverse("Zelenoglazka");
        //============================
        HW_StringMethods.printStringReverse("");
        HW_StringMethods.printStringReverse("\n\t\r");
        HW_StringMethods.printStringReverse("  ");
        HW_StringMethods.printStringReverse(null);

    }

    @Test
    void testIsIsrPhoneNumber() {
        assertTrue(HW_StringMethods.isIsrPhoneNumber("0123659845"));
        assertFalse(HW_StringMethods.isIsrPhoneNumber("01265984"));
        assertFalse(HW_StringMethods.isIsrPhoneNumber("012659812312314"));
        assertFalse(HW_StringMethods.isIsrPhoneNumber("012a65984"));
        assertFalse(HW_StringMethods.isIsrPhoneNumber(" 01265984"));
        assertFalse(HW_StringMethods.isIsrPhoneNumber("1265984910"));
        //===========
        assertNull(HW_StringMethods.isIsrPhoneNumber(""));
        assertNull(HW_StringMethods.isIsrPhoneNumber(" \n\t "));
        assertNull(HW_StringMethods.isIsrPhoneNumber(null));
    }

    @Test
    void printSubStringReverse() {
        String test = "Zelenoglazka";
        HW_StringMethods.printSubStringReverse(test,1,5);
        HW_StringMethods.printSubStringReverse(test,0,test.length()-1);
        HW_StringMethods.printSubStringReverse(test,3,4);
        HW_StringMethods.printSubStringReverse(test,3,3);
        //===============
        HW_StringMethods.printSubStringReverse(null,1,5);
        HW_StringMethods.printSubStringReverse("",1,5);
        HW_StringMethods.printSubStringReverse("\t\n ",1,5);
        HW_StringMethods.printSubStringReverse(" ",1,5);
        HW_StringMethods.printSubStringReverse(test,1,test.length());
        HW_StringMethods.printSubStringReverse(test,-1,5);
        HW_StringMethods.printSubStringReverse(test,5,1);
    }

    @Test
    void printSubStringReverse_arr() {
        String test = "Zelenoglazka";
        HW_StringMethods.printSubStringReverse(test,1,5);
        HW_StringMethods.printSubStringReverse(test,0,test.length()-1);
        HW_StringMethods.printSubStringReverse(test,3,4);
        HW_StringMethods.printSubStringReverse(test,3,3);
        //===============
        HW_StringMethods.printSubStringReverse(null,1,5);
        HW_StringMethods.printSubStringReverse("",1,5);
        HW_StringMethods.printSubStringReverse("\t\n ",1,5);
        HW_StringMethods.printSubStringReverse(" ",1,5);
        HW_StringMethods.printSubStringReverse(test,1,test.length());
        HW_StringMethods.printSubStringReverse(test,-1,5);
        HW_StringMethods.printSubStringReverse(test,5,1);
    }

    @Test
    void testGetWordsReverse(){
        String str = "Hello my nice world";
        String exp = "world nice my Hello";
        assertEquals(exp,HW_StringMethods.getWordsReverse(str));
    }

    @Test
    void testGetWordsReverseWithJoin(){
        String str = "Hello my nice world";
        String exp = "world nice my Hello";
        assertEquals(exp,HW_StringMethods.getWordsReverse(str));
        assertEquals("Hello",HW_StringMethods.getWordsReverse("Hello"));
        assertEquals("Hello",HW_StringMethods.getWordsReverse("\nHello"));
        //=================
        assertNull(HW_StringMethods.getWordsReverseWithJoin(""));
        assertNull(HW_StringMethods.getWordsReverseWithJoin(" \n"));
        assertNull(HW_StringMethods.getWordsReverseWithJoin(null));

    }

    @Test
    void testPrintWordsReverseInColumn(){
        String str = "Hello my nice world";
        HW_StringMethods.printWordsReverseInColumn(str);
        HW_StringMethods.printWordsReverseInColumn("");
        HW_StringMethods.printWordsReverseInColumn(" \n\t");
        HW_StringMethods.printWordsReverseInColumn(null);

    }

    @Test
    void testPrintWordsReverseInColumn2(){
        String str = "Hello my nice world";
        HW_StringMethods.printWordsReverseInColumn2(str);

        HW_StringMethods.printWordsReverseInColumn2("");
        HW_StringMethods.printWordsReverseInColumn2(" \n\t");
        HW_StringMethods.printWordsReverseInColumn2(null);

    }
}