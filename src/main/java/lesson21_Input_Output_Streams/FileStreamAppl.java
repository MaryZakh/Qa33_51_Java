package lesson21_Input_Output_Streams;

import java.io.*;

public class FileStreamAppl {

    public static void main(String[] args) throws IOException {

        File file = new File("myFile.txt");
        if(!file.exists())
            file.createNewFile();
        BufferedReader brc = new BufferedReader(new InputStreamReader(System.in));
        String input = brc.readLine();

        FileWriter fw = new FileWriter(file,true);
        fw.write(input + "\n");
        fw.flush();

        BufferedReader brf = new BufferedReader(new FileReader(file));
        String line;
        StringBuilder builder = new StringBuilder();
        while ((line = brf.readLine())!=null) {
            builder.append(line + "\n");
        }

        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        osw.write(builder.toString());

        brf.close();
        fw.close();
        brc.close();
        osw.close();

    }
}
