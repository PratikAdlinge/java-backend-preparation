import java.util.Scanner;

public class A06_Smallest_Of_Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a<b && a<c) {
            System.out.println("A ="+a +"is smallest");
            
        } else if (b<a && b<c) {
            System.out.println("B ="+b +"is s,allest");
            
        } else {
             System.out.println("c ="+c +" is smallest");

            
        }
    }
}
