package lesson1;

public class Intro {



    public static void main(String[] args) {
        byte a = 3;//-128 -127 1 byte
        byte b = 8;
        short c = 3; //-32768 - 32767 - 2 byte
        short d = 8;
        int f = 4; //4 byte
        int g = 9;
        long h = 5;// 8 byte
        //char r = 'c';

        //***********************************************
        float x = 8.5F;//4 byte
        double y = 8.5; //8 byte
        //***********************************************
        boolean isActive = true;
        boolean isAlive = false;
        //***********************************************
        char k = 123;
        char l = 'c';
        System.out.println(k);
        System.out.println(l);
        //**********************************************
        int[]ar=new int[10];
        System.out.println(ar);
        ar[4] = 17;
        System.out.println(ar[4]);

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

        byte[]ar1 = new byte[]{1,2,3,4};
        for (int i = 0; i < ar1.length; i++) {
            System.out.println(ar1[i]);
        }

    }
}
