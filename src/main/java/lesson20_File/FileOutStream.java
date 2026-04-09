package lesson20_File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutStream {

    public static void main(String[] args) throws IOException {
        Person[]persons = {
                new Person(30,"Vasya",12345),
                new Person(23,"Katya",23456),
                new Person(45,"Vanya",34567),
                new Person(90,"Egor",45678),
        };

        File file = new File("file2.txt");
        if(!file.exists())
            file.createNewFile();


        //FileWriter fw = new FileWriter(file);
        FileWriter fw = new FileWriter(file,true);
        for(Person p:persons){
            fw.write(p.toString()+ "\n");
        }
        fw.close();
    }
}
