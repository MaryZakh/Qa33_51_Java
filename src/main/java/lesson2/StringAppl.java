package lesson2;

public class StringAppl {
    public static void main(String[] args) {
        //option 1
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);
        //option 1
        String str3 = new String("MAMA");
        String str4 = new String("MAMA");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        String str5 = new String("mama");
        System.out.println(str3.equals(str5));
        System.out.println(str3.equalsIgnoreCase(str5));

        //option 3
        char[]symbols = {'P','a','p','a','!'};
        String str6 = new String(symbols);
        System.out.println(str6);
        //System.out.println(""+10+15+20);
    }
}
