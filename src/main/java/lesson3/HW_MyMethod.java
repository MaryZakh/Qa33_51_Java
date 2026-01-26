package lesson3;

public class HW_MyMethod {

    public static Double calculator(double a1, double a2, String action) {
        switch (action) {
            case "+":
                return a1 + a2;
            case "-":
                return a1 - a2;
            case "*":
                return a1 * a2;
            case "/":
                return a1 / a2;
            default:
                return null;

        }
    }

}
