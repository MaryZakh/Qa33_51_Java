package lesson4;

public class StringBuilderIntr {

    public static void main(String[] args) {
        StringBuilder strB1 = new StringBuilder();
        System.out.println(strB1.capacity());
        System.out.println(strB1.length());

        StringBuilder strB2 = new StringBuilder(100);
        System.out.println(strB2.capacity());
        System.out.println(strB2.length());

        StringBuilder strB3 = new StringBuilder("Hello");
        System.out.println(strB3.capacity());
        System.out.println(strB3.length());


        strB1.append("Hi, i am...");
        System.out.println(strB1.capacity());
        System.out.println(strB1.length());
        strB1.append("Vasily Alibabaevich");
        System.out.println(strB1);
        System.out.println(strB1.capacity());
        System.out.println(strB1.length());
        strB1.append("!!!!!");
        System.out.println(strB1.capacity());
        System.out.println(strB1.length());
        System.out.println(strB1);
        //=================
        String str = "Mama";
        str = str + " myla";
        System.out.println(str);
        //=================

        System.out.println(strB1.charAt(0));
        System.out.println(strB1.capacity());
        String res = strB1.toString();
        System.out.println(res.length());

        strB1.reverse();
        System.out.println(strB1);
        strB1.reverse();
        System.out.println(strB1);

        strB1.insert(2, "gggg");
        System.out.println(strB1);

        strB1.deleteCharAt(2);
        System.out.println(strB1);
        strB1.delete(2, 5);
        System.out.println(strB1);
        //================================
        //Str -> Mama myla ramu -->UMAR ALYM AMAM
        String res1 = function1("Mama myla ramu");
        System.out.println(res1);
    }

    private static String function1(String s) {
       // return new StringBuilder(s).reverse().toString().toUpperCase();
        return new StringBuilder(s.toUpperCase()).reverse().toString();
    }
}
