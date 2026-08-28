package Exception_Handling;

import java.util.Scanner;
class InvalidageException extends Exception{
    InvalidageException (String msg) {
        super(msg);
    }
}

public class P07_SimpleThrowExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Age :");
        int age=sc.nextInt();
        if (age<18) {
            try {
                throw new InvalidageException("not eligible for vote");

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }
            
        } else {
            System.out.println("Eligible for vote");
        }
    }
}
