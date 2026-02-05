package lesson6;

public class StringExpressions {

    public static boolean isPositiveLessThanEquals255(String s) {
        if (s == null || s.isBlank())
            return false;
        //1-9|10-99|100-199|200-249|250-255
        String regExp = "[1-9]\\d?|1\\d{2}|2[0-4]\\d|25[0-5]";
        return s.matches(regExp);

    }

    public static boolean isNumber(String s) {
        if (s == null || s.isBlank())
            return false;
        // String regExp = "-?(0\\.\\d+|[1-9]\\d*(\\.\\d+)?)|0";
        String regExp = "-?(0|[1-9]\\d*)(\\.\\d+)?";
        return s.matches(regExp);
    }

    public static boolean isIsraelMobile(String s) {
        if (s == null || s.isBlank())
            return false;
        String regExp = "(\\+972-?5|05)[2-58](-?\\d){7}";
        return s.matches(regExp);
    }
}
