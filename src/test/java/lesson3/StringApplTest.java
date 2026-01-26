package lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringApplTest {

    @Test
    void testStringMethods() {
        //isEmpty
        String str1 = "Hellolololo";
        String str2 = "";
        String str3 = "  ";
        assertFalse(str1.isEmpty());
        assertTrue(str2.isEmpty());
        assertFalse(str3.isEmpty());
        //isBlank
        assertFalse(str1.isBlank());
        assertTrue(str2.isBlank());
        assertTrue(str3.isBlank());
        //length
        assertEquals(11, str1.length());
        assertEquals(0, str2.length());
        assertEquals(2, str3.length());
        //charAt
        assertEquals('H', str1.charAt(0));
        //indexOf
        assertEquals(4, str1.indexOf('o'));
        assertEquals(-1, str1.indexOf('w'));
        //lastIndexOf
        assertEquals(str1.length() - 1, str1.lastIndexOf('o'));
        assertEquals(-1, str1.lastIndexOf('w'));
        //toUpperCase
        String str4 = "HELLO";
        String str5 = "hello";
        String str6 = str5.toUpperCase();
        assertTrue(str4.equals(str6));
        //toLowerCase
        String str7 = str4.toLowerCase();
        assertTrue(str5.equals(str7));
        //toCharArray
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String str8 = "Hello";
        char[] res = str8.toCharArray();
        assertArrayEquals(chars, res);
    }

    @Test
    void testymbolSearch() {
        assertTrue(StringAppl_1.symbolSearch("Abrakadabra", 'r'));
        assertFalse(StringAppl_1.symbolSearch("Abrakadabra", 'w'));
    }

    @Test
    void trimTest() {
        String test = "  Hello! ";
        String exp = "Hello!";
        assertEquals(exp, test.trim());
        assertTrue(exp.equals(test.trim()));

        test = "  Hello!\n\t";
        assertEquals(exp, test.trim());

        test = "  H e l l o ! ";
        exp = "H e l l o !";
        assertEquals(exp, test.trim());
    }

    @Test
    void replaceTest() {
        String test = "Zelenoglazka";
        assertEquals("zelenoglazka", test.replace('Z', 'z'));
        assertEquals("Zulunoglazka", test.replace('e', 'u'));
        assertEquals("Zelenoglazka", test.replace('w', 't'));

        test = "Abrakadabra";
        assertEquals("ABRAkadaBRA", test.replace("bra", "BRA"));
    }

    @Test
    void subStringTest() {
        String test = "Zelenoglazka";
        assertEquals("Zelen", test.substring(0, 5));
        assertEquals("glazka", test.substring(6));
    }

    @Test
    void joinTest() {
        String[] strs = {"AB", "mumu", "Yellow", "Blue", "Stream"};
        String test = String.join(" ;", strs);
        String exp = "AB ;mumu ;Yellow ;Blue ;Stream";
        assertEquals(exp, test);

        test = String.join("; ", strs[0], strs[2], strs[1]);
        exp = "AB; Yellow; mumu";
        assertEquals(exp, test);

    }

    @Test
    void splitTest() {
        String test = "Hello my world";
        String[] strs = test.split(" ");
        String[] exp = {"Hello", "my", "world"};
        assertArrayEquals(exp, strs);

        test = " Hello my world";
        strs = test.split(" ");
        String[]exp2 = {"","Hello", "my", "world"};
        assertArrayEquals(exp2, strs);

        test = "   Hello my world     ";
        strs = test.split(" ");
        String[]exp3 = {"","","","Hello", "my", "world"};
        assertArrayEquals(exp3, strs);

    }
}