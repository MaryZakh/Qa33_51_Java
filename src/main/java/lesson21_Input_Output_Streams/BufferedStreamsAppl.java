package lesson21_Input_Output_Streams;

import java.io.*;

public class BufferedStreamsAppl {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //String str =  br.readLine();
        //bw.write(str);
//        while (true){
//            bw.write("Enter name or exit");
//            bw.newLine();
//            bw.flush();
//            String answer = br.readLine();
//            if(answer.equalsIgnoreCase("exit"))
//                break;
//            bw.write("Hello " + answer);
//            bw.newLine();
//        }
        int res = 0;
        String answer = "";
        do {
            bw.write("Enter integer number: ");
            bw.flush();
            answer = br.readLine();
            try {
                res += Integer.parseInt(answer);
            } catch (Exception e) {
                bw.write("Error! Enter only integer numbers!!!");
                bw.newLine();
                bw.flush();
                continue;
            }
            bw.write("More? Yes/No");
            bw.newLine();
            bw.flush();
            answer = br.readLine();
        } while (!answer.equalsIgnoreCase("No"));

        bw.write("Result sum = " + res);


        br.close();
        bw.close();
    }
}
