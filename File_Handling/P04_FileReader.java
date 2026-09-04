package File_Handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P04_FileReader {
    public static void main(String[] args) throws IOException {
        FileReader f= new FileReader("C:\\Users\\ADMIN\\OneDrive\\Desktop\\file1.txt");

        int i;
        while ((i=f.read()) !=-1){
            System.out.print((char)i);
            //f.close();
        }
        f.close();
        
    }
}
