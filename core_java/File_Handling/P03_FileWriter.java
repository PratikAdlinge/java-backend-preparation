package File_Handling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class P03_FileWriter  {
    public static void main(String[] args)throws IOException {
        FileWriter f=new FileWriter("C:\\Users\\ADMIN\\OneDrive\\Desktop\\file1.txt");

        f.write("Welcome To Simca ... tumch Kalyan Zal...");
        f.close();
        System.out.println("Successfuly data wrote in file");

        
        
    }
}
