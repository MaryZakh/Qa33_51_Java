package lesson6;

public class HW_RegExpIntr {


    public static boolean isPositiveLessThen300(String s) {
        if (s == null || s.isBlank())
            return false;
        //1-9|10-99|100-199|200-299
        String regExp = "[1-9]\\d?|[12]\\d{2}";
        return s.matches(regExp);
    }

    public static boolean checkCreditCardNumber(String s) {
        if (s == null || s.isBlank())
            return false;
        //val: 8-16

        String regExp = "\\d{8,16}";
        return s.matches(regExp);

    }

    public static boolean checkDateFormatEU(String s) {
        if (s == null || s.isBlank())
            return false;
        //01-09|10-19|20-29|30-31
        //01-09|10-12

        //"25.01.2020"

        String regExp = "((0[1-9])|([12]\\d)|(3[01]))\\.((0[1-9])|(1[0-2]))\\.\\d{4}";
        return s.matches(regExp);
    }
}
