package File_Handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class P05_CopyingData {
    public static void main(String[] args ) throws Exception {
        FileInputStream r=new FileInputStream("C:\\Users\\ADMIN\\OneDrive\\Desktop\\file1.txt");
        FileOutputStream w=new FileOutputStream("C:\\Users\\ADMIN\\OneDrive\\Desktop\\file2.txt");

        int i;
        while((i=r.read())!=-1) {
            w.write((char)i);
        }
        System.out.println("Copy data successfully");
    }
    
}
