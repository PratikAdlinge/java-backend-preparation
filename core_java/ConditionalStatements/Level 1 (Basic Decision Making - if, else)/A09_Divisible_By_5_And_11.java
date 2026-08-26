import java.util.Scanner;

public class A09_Divisible_By_5_And_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no ");
        int number=sc.nextInt();
        if (number%5==0 && number%11==0) {
            System.out.println("number is divisible by both 5 and 11");
            
        }
        else if(number%5==0) {
            System.out.println("number is divisible by 5 only");

        }
        else if(number%11==0) {
            System.out.println("number is divisible by 11 only ");
         }
         else {
            System.out.println("number is not divisible by 5 and 11");
         }
    }
}
