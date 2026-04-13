package lesson21_HW_File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHwAppl {

    public static void main(String[] args) {
        File folder = new File("c:/MyHomeWork/TestFile");
        if (!folder.exists())
            folder.mkdirs();

        File file = new File(folder, "myFile.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("File not created");
            }
        }

        String[] strs = {"Mama", "myla", "ramu"};
        try {
            FileWriter fw = new FileWriter(file);
            for (String str : strs) {
                fw.write("[" + str + "]");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("File read only");
        }
        System.out.println(file.length()/1024. + " KB");
//        File temp;
//        for (int i = 0; i < 10; i++) {
//         temp = file.getParentFile();
//            System.out.println(file);
//            file = temp;
//        }
//        File folder2 = new File("c:/");
//        System.out.println(folder2.canWrite());
        cascadDelete(file);

    }
    private static void cascadDelete(File child){
        File temp;
        while ((temp=child.getParentFile()) !=null){
            child.delete();
            child = temp;
        }
    }

}
