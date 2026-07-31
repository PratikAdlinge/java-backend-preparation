import java.util.Scanner;

public class A08_Voting_Eligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if (age>=18) {
            System.out.println("eligible for vote ");
            
        }
        else
        {
            System.out.println("not eligible for vote");
        }
    }
}
