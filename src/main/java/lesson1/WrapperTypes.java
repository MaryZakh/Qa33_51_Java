package lesson1;

public class WrapperTypes {

public static void main(String[] args) {
        /*
        byte -Byte
        short - Short
        int - Integer
        long - Long
        --
        float - Float
        double - Double
        --
        char - Character
        --
        boolean - Boolean
        */

    int a = 7;
    //Integer a1 = new Integer(8);
    Integer a1 = 7;//autopack
    if (a == a1)
        System.out.println("equals");//autoUnpack
    int res = a + a1;//
    System.out.println(res);

    System.out.println(Integer.toBinaryString(a1));
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.SIZE);
    System.out.println(Double.SIZE);
    System.out.println(Double.MIN_VALUE);
    System.out.println("===================================");

    int a2 = 10, b = 4;
    Double res2 = div(a2, b);
    if (res2 != null)
        System.out.println(res2);
    else
        System.out.println("b eql null");

    Integer[] ints = {1, 2, 3, 4, 5, 6, 0, 9, 100};
    for (int i = 0; i < ints.length; i++) {
        // Integer integer = ints[i];
        System.out.print(ints[i] + " ");
        System.out.println();

    }

    //===================================
    System.out.println("************************");
    String s = "1.25";
    System.out.println(s + 2);
    Double temp = Double.parseDouble(s);
    System.out.println(temp + 2);
    s = "123";
    Integer temp2 = Integer.parseInt(s);
    System.out.println(temp2 + 2);

    boolean temp3 = Boolean.parseBoolean("TRUE");//TRUE//True//true//tRUE
    if(temp3)
        System.out.println("Hello");

}


private static Double div(int a2, int b) {
    if (b == 0)
        return null;
    return a2 * 1. / b;
}
}
