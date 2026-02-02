package lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegExpTest {
//SQL - > "_%" -->"abcd" -->"____"
// "afvbljgdbkb" --> "a%b"
// "Mama myla ramu","Mama go home" -->"Mama %"
//MS-DOS--> dir*.*
// RegExp
//  "Mama", "Pama", "Lama","Dama" -->"[MPLD]ama" (".ama");
//"!Aama", "!Bama","!Cama" -->"[^ABC]ama";
//"mama","pama","s","when","HELLO"-->"[a-zA-Z]*"
//"mama","pama","s","when","HELLO"-->"[a-zA-Z]+"
//1234435556412365" --> "1234\d{12}
//1234435556" --> "1234\d{3,10}

    @Test
    void testMatcherTrue(){
        assertTrue(RegExp.isTrue("true"));
        assertTrue(RegExp.isTrue("True"));
        assertFalse(RegExp.isTrue("TRue"));
        assertFalse(RegExp.isTrue("TRUE"));
        assertFalse(RegExp.isTrue("trrue"));
        assertFalse(RegExp.isTrue("truetrue"));
        assertFalse(RegExp.isTrue("exception"));
    }

    @Test
    void testMatchesNumber(){
        assertTrue(RegExp.isNumber("123456"));
        assertTrue(RegExp.isNumber("9"));
        assertTrue(RegExp.isNumber("0"));
        assertFalse(RegExp.isNumber("9.5"));
        assertFalse(RegExp.isNumber("0123"));
        assertFalse(RegExp.isNumber("9$5"));
        assertFalse(RegExp.isNumber(" 123"));
        assertFalse(RegExp.isNumber("123 "));
        assertFalse(RegExp.isNumber("1 2 3"));
    }

    @Test
    void testThreeDigitsNumber(){
        assertTrue(RegExp.isThreeDigitsNumber("123"));
        assertTrue(RegExp.isThreeDigitsNumber("987"));

        assertFalse(RegExp.isThreeDigitsNumber("023"));
        assertFalse(RegExp.isThreeDigitsNumber("23"));
        assertFalse(RegExp.isThreeDigitsNumber("2345"));
        assertFalse(RegExp.isThreeDigitsNumber("1a3"));
        assertFalse(RegExp.isThreeDigitsNumber("2 3"));
        assertFalse(RegExp.isThreeDigitsNumber("2$3"));
    }

    @Test
    void testPositiveNumberLessThan1000(){
        assertTrue(RegExp.isPositiveNumberLessThan1000("1"));
        assertTrue(RegExp.isPositiveNumberLessThan1000("999"));

        assertFalse(RegExp.isPositiveNumberLessThan1000("1000"));
        assertFalse(RegExp.isPositiveNumberLessThan1000("-1"));
        assertFalse(RegExp.isPositiveNumberLessThan1000("0"));
        assertFalse(RegExp.isPositiveNumberLessThan1000("1F0"));
    }

    @Test
    void testProgrammingName(){
        assertTrue(RegExp.isProgrammingName("__"));
        assertTrue(RegExp.isProgrammingName("_"));
        assertTrue(RegExp.isProgrammingName("abc1"));
        assertTrue(RegExp.isProgrammingName("Abc1"));
        assertTrue(RegExp.isProgrammingName("oiuggor"));
        assertTrue(RegExp.isProgrammingName("abc_1"));
        assertTrue(RegExp.isProgrammingName("abc12345"));

        assertFalse(RegExp.isProgrammingName("fr#3"));
        assertFalse(RegExp.isProgrammingName("@fr3"));
        assertFalse(RegExp.isProgrammingName("fr+3"));
        assertFalse(RegExp.isProgrammingName("fr 3"));
        assertFalse(RegExp.isProgrammingName("fr%"));
        assertFalse(RegExp.isProgrammingName("3fr"));
    }
}