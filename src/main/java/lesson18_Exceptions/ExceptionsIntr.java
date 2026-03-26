package lesson18_Exceptions;

public class ExceptionsIntr {

    public static void main(String[] args) {
        int a = 10, b = 1;
        System.out.println("Start programm");
        try {
            int res = divInt(a, b);
            System.out.println(res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String str = "3.1.4";
        boolean resB = isNumber(str);
        System.out.println(resB);


       // Integer[] ar = {1, null,2, 3, 4, 5};
        Integer[] ar = {1,2, null, 3, 4, 5};
        int minInd = 0, maxInd = 3;

        try{
            int res2 = sumAllElementsInRange(ar,minInd,maxInd);
            System.out.println(res2);
        }catch (NullPointerException e){
            System.out.println("NullPointerException" + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage());
        }catch (Exception e){
            System.out.println("ups");
        }


        System.out.println("End programm");
    }

    private static int sumAllElementsInRange(Integer[] ar, int minInd, int maxInd) {
        int res = 0;
        for (int i = minInd; i < maxInd; i++) {
            res+=ar[i];
        }
        return res;
    }

    private static boolean isNumber(String str) {
        try {
            double res = Double.parseDouble(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private static int divInt(int a, int b) {
        return a / b;
    }
}
