package lesson4;

public class StringVSStringBuilder {
    private static final int N_RUNS = 1_000_000;


    public static void main(String[] args) {
        long timestamp = System.currentTimeMillis();
        concatUsingString();
        System.out.println("Time with string: "+(System.currentTimeMillis()-timestamp) );

        timestamp = System.currentTimeMillis();
        concatUsingStringBuilder();
        System.out.println("Time with stringBuilder: "+(System.currentTimeMillis()-timestamp) );

    }

    private static void concatUsingStringBuilder() {
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < N_RUNS; i++) {
            strB.append("aa");
        }
    }

    private static void concatUsingString() {
        String str = "";
        for (int i = 0; i < N_RUNS; i++) {
            str+="aa";
        }
    }
}
