package File_Handling;

import java.io.File;

public class P02_FileInfo {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\ADMIN\\OneDrive\\Desktop\\file1.txt");

        if (f.exists()) {
            System.out.println("File Name:"+f.getName());
            System.out.println("File Path:"+f.getAbsolutePath());
            System.out.println("File Readable:"+f.canRead());
            System.out.println("File Writeable:"+f.canWrite());
            System.out.println("Size of File"+f.length());
            System.out.println(f.delete());
        } else {
            System.out.println("File Does Not Exists");
        }
    }
}
