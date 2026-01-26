package lesson3;

public class HW_ArgsAppl {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Args is empty");
            return;
        }

        System.out.println("Total sum: " + sumArgs(args));
        System.out.println("Average: " + avrArgs(args));
    }

    public static Double sumArgs(String[] args) {
        if (args == null || args.length == 0)
            return null;
        double res = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] == null)
                continue;
            res += Double.parseDouble(args[i]);
        }
        return res;
    }

    public static Double avrArgs(String[] args) {
        if (args == null || args.length == 0)
            return null;

        double res = 0;
        int count = 0;

        for (int i = 0; i < args.length; i++) {
            if (args[i] == null)
                continue;
            res += Double.parseDouble(args[i]);
            count++;
        }
        return res / count;
    }

}
