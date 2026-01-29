package lesson4;

public class HW_StringMethods {


    public static void printStringReverse(String str) {
        if (str == null || str.isBlank()) {
            System.out.println("Wrong string");
            return;
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static Boolean isIsrPhoneNumber(String phone) {
        if (phone == null || phone.isBlank()) {
            return null;
        }
        if (phone.charAt(0) != '0' || phone.length() != 10) {
            return false;
        }
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void printSubStringReverse(String str, int start, int finish) {
        if (str == null || str.isBlank() || start < 0 || finish >= str.length() || start > finish) {
            System.out.println("Wrong args");
            return;
        }
        for (int i = 0; i < start; i++) {
            System.out.print(str.charAt(i));
        }
        for (int i = finish; i >= start; i--) {
            System.out.print(str.charAt(i));
        }
        for (int i = finish; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }


    public static void printSubStringReverse_arr(String str, int start, int finish) {
        if (str == null || str.isBlank() || start < 0 || finish >= str.length() || start > finish) {
            System.out.println("Wrong args");
            return;
        }
        char[] temp = str.toCharArray();
        for (int i = start, j = finish; i < j; i++, j--) {
            swap(temp, i, j);
        }
        System.out.print(new String(temp));
    }

    private static void swap(char[] array, int i, int j) {
        char t = array[i];
        array[i] = array[j];
        array[j] = t;
        //[m][i][r][a][y][a]
        // 0  1  2  3  4  5
        //char t = 'a'
        //1 - i
        //3 - a
    }


    public static String getWordsReverse(String s) {
        if (s == null || s.isBlank())
            return null;

        s = s.trim();
        String temp = "";
        String[] strs = s.split(" ");// ["Hello"] ["my"] ["nice"] ["world']
        for (int i = strs.length - 1; i > 0; i--) {
            temp += strs[i] + " ";
        }
        temp += strs[0];
        return temp;
    }

    public static String getWordsReverseWithJoin(String s) {
        if (s == null || s.isBlank())
            return null;
        s = s.trim();

        String[] strs = s.split(" ");// ["Hello"] ["my"] ["nice"] ["world']
        for (int i = strs.length - 1, j = 0; i > j; i--, j++) {
            String temp = strs[i];
            strs[i] = strs[j];
            strs[j] = temp;
        }
        return String.join(" ", strs);
    }


    public static  void printWordsReverseInColumn(String s){
        if(s==null||s.isBlank()){
            System.out.println("Wrong string");
            return;
        }

        String res = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            res+=s.charAt(i);
        }
        String[]strs = res.split(" ");
        for (int i = strs.length-1; i >=0 ; i--) {
            System.out.println(strs[i]);
        }
    }

    private static String reverse(String s){
        if (s == null || s.isBlank())
            return null;
        s = s.trim();
        char[]chars = s.toCharArray();
        for (int i = 0,j = chars.length-1; i < j; i++,j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] =temp;
        }
        return new String(chars);
    }

    public static  void printWordsReverseInColumn2(String s){
        if(s==null||s.isBlank()){
            System.out.println("Wrong string");
            return;
        }
        s = s.trim();
        String[]strs = s.split(" ");
        for (int i = 0; i < strs.length; i++) {
            System.out.println(reverse(strs[i]));
        }
    }

}
