package lesson3;

public class StringAppl_1 {

    public static boolean symbolSearch(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                return true;
        }
        return false;
    }
}
