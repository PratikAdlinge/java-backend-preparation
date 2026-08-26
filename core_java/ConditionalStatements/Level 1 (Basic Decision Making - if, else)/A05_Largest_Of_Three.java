import java.util.Scanner;

public class A05_Largest_Of_Three {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b && a>c) {
            System.out.println("A ="+a +"is largest");
            
        } else if (b>a && b>c) {
            System.out.println("B ="+b +"is largest");
            
        } else {
             System.out.println("c ="+c +" is largest");

            
        }
        
    }
}
