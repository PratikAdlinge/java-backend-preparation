import java.util.Scanner;

public class A03_Largest_Of_Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a>b) {
            System.out.println("A is greater than B " +a +" > "+b);
            
        } else {
             System.out.println("B is greater than A " +b +" > "+a);
            
        }
    }
}
