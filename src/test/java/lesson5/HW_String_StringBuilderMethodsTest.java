package lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HW_String_StringBuilderMethodsTest {

    @Test
    void testMaxCharIndex() {
        String s = "ddcccabbbbb";
        assertEquals(6, HW_String_StringBuilderMethods.maxCharIndex(s));
        s = "ddc*c*c*a*b*b*b*b*b";
        assertEquals(3, HW_String_StringBuilderMethods.maxCharIndex(s));
        s = "dd   ccc   bbb  bb";
        assertEquals(2, HW_String_StringBuilderMethods.maxCharIndex(s));
        s = "d";
        assertEquals(0, HW_String_StringBuilderMethods.maxCharIndex(s));

        assertEquals(-1, HW_String_StringBuilderMethods.maxCharIndex(null));
        assertEquals(-1, HW_String_StringBuilderMethods.maxCharIndex("  "));
        assertEquals(-1, HW_String_StringBuilderMethods.maxCharIndex("\n\t"));
        //assertEquals(-1,HW_String_StringBuilderMethods.maxCharIndex("привет"));
    }

    @Test
    void testMaxCharIndex2() {
        String s = "ddcccabbbbb";
        assertEquals(6, HW_String_StringBuilderMethods.maxCharIndex2(s));
        s = "ddc*c*c*a*b*b*b*b*b";
        assertEquals(3, HW_String_StringBuilderMethods.maxCharIndex2(s));
        s = "dd   ccc   bbb  bb";
        assertEquals(2, HW_String_StringBuilderMethods.maxCharIndex2(s));
        s = "d";
        assertEquals(0, HW_String_StringBuilderMethods.maxCharIndex2(s));

        assertEquals(-1, HW_String_StringBuilderMethods.maxCharIndex2(null));
        assertEquals(-1, HW_String_StringBuilderMethods.maxCharIndex2("  "));
        assertEquals(-1, HW_String_StringBuilderMethods.maxCharIndex2("\n\t"));
    }


    @Test
    void testPrintInColumnReverse() {
        String s = "Hello";
        HW_String_StringBuilderMethods.printInColumnReverse(s);

        HW_String_StringBuilderMethods.printInColumnReverse(null);
        HW_String_StringBuilderMethods.printInColumnReverse("");
        HW_String_StringBuilderMethods.printInColumnReverse(" \n\t");
    }
}