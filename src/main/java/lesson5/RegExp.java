package lesson5;

public class RegExp {

    public static boolean isTrue(String s) {
        String reg = "[Tt]rue";
        return s.matches(reg);

    }


    public static boolean isNumber(String s) {
        String reg = "0|[1-9]\\d*";//[^0]\\d+";
        return s.matches(reg);
    }

    public static boolean isThreeDigitsNumber(String s) {
        String reg = "[1-9]\\d{2}";
        return s.matches(reg);
    }

    public static boolean isPositiveNumberLessThan1000(String s) {
        String reg = "[1-9]\\d{0,2}";
        return s.matches(reg);
    }

    public static boolean isProgrammingName(String s) {
        String reg = "[_a-zA-Z]\\w*";
        return s.matches(reg);
    }



}
