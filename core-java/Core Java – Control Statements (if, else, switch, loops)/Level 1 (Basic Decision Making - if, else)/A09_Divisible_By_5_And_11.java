import java.util.Scanner;

public class A09_Divisible_By_5_And_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no ");
        int no=sc.nextInt();
        if (no%5==0 && no%11==0) {
            System.out.println("number is divisible by both 5 and 11");
            
        }
        else if(no%5==0) {
            System.out.println("number is divisible by 5 only");

        }
        else if(no%11==0) {
            System.out.println("number is divisible by 11 only ");
         }
         else {
            System.out.println("number is not divisible by 5 and 11");
         }
    }
}
