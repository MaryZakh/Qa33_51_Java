package lesson19_HW_Exception;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class CalculatorExceptionsTest {

//    @Test
//    public void testCalcPositive() throws MyArithmeticException {
//        double a = 3.5, b = 0.5;
//        double res = 4.0;
//        assertEquals(res,CalculatorExceptions.calculator(a,b,'+'));
//        res = 3.0;
//        assertEquals(res,CalculatorExceptions.calculator(a,b,'-'));
//        res = 1.75;
//        assertEquals(res,CalculatorExceptions.calculator(a,b,'*'));
//        res = 7;
//        assertEquals(res,CalculatorExceptions.calculator(a,b,'/'));
//
//    }
//
//    @Test (expected = MyArithmeticException.class)
//    public void testCalcDivByZero() throws MyArithmeticException {
//        double a = 3.5, b = 0.;
//        CalculatorExceptions.calculator(a,b,'/');
//    }

    @Test
    void testCalcDivByZero() {
        double a = 3.5, b = 0.0;
        try {
            CalculatorExceptions.calculator(a, b, '/');
            fail("No MyArithmeticException");
        } catch (MyArithmeticException e) {
            //e.printStackTrace();
        }
    }


    @Test
    void testCalcNegativeWrongAction() throws MyArithmeticException {
        double a = 3.5, b = 0.5;

        try {
            CalculatorExceptions.calculator(a, b, '$');
            fail("No IllegalArgumentException");
        } catch (IllegalArgumentException e) {

        }

    }

}