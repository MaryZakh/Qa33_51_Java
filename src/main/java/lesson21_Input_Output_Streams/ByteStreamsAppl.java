package lesson21_Input_Output_Streams;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamsAppl {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        OutputStream os = System.out;

//        int i = is.read();
//        //System.out.println(i);
//        os.write(i);
//        i = is.read();
//        os.write(i);

      int i;
      while ((i = is.read())!= -1)
        os.write(i);

        is.close();
        os.close();
    }




}
