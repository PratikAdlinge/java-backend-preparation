package File_Handling;

import java.io.File;
import java.io.IOException;

public class P01_Createfile {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\ADMIN\\OneDrive\\Desktop\\file1.txt");
        if (f.createNewFile()) {
            System.out.println("Successfully Created");
        } else {
            System.out.println("File Already exist:");
        }
    }
}
