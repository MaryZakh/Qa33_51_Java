package lesson21_Input_Output_Streams;

import java.io.*;

public class CharacterStreamAppl {

    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        InputStreamReader reader = new InputStreamReader(is);

//        OutputStream os = System.out;
//        OutputStreamWriter writer = new OutputStreamWriter(os);
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
//        int i = reader.read();
//        writer.write(i);

        char i;
        while ((i = (char) reader.read()) != 'q') {
            writer.write(i);
            writer.flush();
        }

        reader.close();
        writer.close();
    }
}
