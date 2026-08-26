import java.util.Scanner;

public class A04_Smallest_Of_Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a>b) {
            System.out.println("B is smallest "+b);
            
        } else {
             System.out.println("A is smallest "+a);
            
        }
    }
    
}
