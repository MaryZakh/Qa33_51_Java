package lesson20_File;

import java.io.File;
import java.io.IOException;

public class FileIntr {

    public static void main(String[] args) throws IOException {
        File file = new File("file1.txt");
        if(!file.exists())
            file.createNewFile();

        //C:\User\marii\OneDrive\Documents\Zoom\ttt.txt

        File folder = new File("C:/qa_33_51");
        System.out.println(folder.exists());
        if(!folder.exists())
            folder.mkdirs();

        File file2 = new File(folder,"file2.txt");
        if(!file2.exists())
            file2.createNewFile();

        System.out.println(file2.length());
        System.out.println(file2.canWrite());
       // file2.setReadOnly();
        System.out.println(file2.canWrite());
        file2.setWritable(true);
        System.out.println(file2.canWrite());

        System.out.println(file2.isFile());
        System.out.println(file2.isDirectory());

        System.out.println(folder.isDirectory());
        System.out.println(folder.isFile());

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getParent());
        System.out.println(file2.getParentFile());
        System.out.println(file2.getTotalSpace()/1024/1024/1024);
        System.out.println(file2.getFreeSpace()/1024./1024/1024);


        System.out.println(file2.delete());
        System.out.println(folder.delete());

        File folder2 = new File("dir1/dir2/dir3/dir4/dir5");
        if(!folder2.exists())
            folder2.mkdirs();


        File file3 = new File(folder2,"file3.txt");
        if(!file3.exists())
            file3.createNewFile();
//======================================================
       File temp;
        for (int i = 0; i < 6; i++) {
          temp = file3.getParentFile();
            System.out.println(file3.delete());
            file3 = temp;
        }

//========================================
        System.out.println("==================================");
        File folder4 = new File("C:/");
        String[]names = folder4.list();
        for(String name:names){
            System.out.println(name);
        }

//========================================
        System.out.println("==================================");
        File[] files = folder4.listFiles();
        for (File f:files){
            if(f.isDirectory())
                System.out.println(f.getName() + " --> folder");
            else
                System.out.println(f.getName() + " --> file");
        }
    }

}
