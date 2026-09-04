package File_Handling;

import java.io.File;
import java.io.IOException;

public class P06_FileHandling {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\ADMIN\\OneDrive\\Desktop\\student.txt");
        
        if(file.createNewFile()) {
            System.out.println("Successfully created :");
        }
    }
}
