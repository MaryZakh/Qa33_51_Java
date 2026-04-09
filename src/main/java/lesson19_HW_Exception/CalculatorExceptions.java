package lesson19_HW_Exception;

public class CalculatorExceptions {

    public static double calculator(double a, double b, char action) throws MyArithmeticException {
        switch (action) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0.) throw new MyArithmeticException("/by zero");
                return a / b;
            default:
                throw new IllegalArgumentException("No such operation");
        }
    }
}
