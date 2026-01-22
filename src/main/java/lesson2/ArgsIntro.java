package lesson2;

public class ArgsIntro {

        public static void main(String[] args) {
            System.out.println(args.length);
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
            System.out.println(args[0]+args[1]);
            double a1 = Double.parseDouble(args[0]);
            double a2 = Double.parseDouble(args[1]);
            System.out.println(a1+a2);

    }

}
