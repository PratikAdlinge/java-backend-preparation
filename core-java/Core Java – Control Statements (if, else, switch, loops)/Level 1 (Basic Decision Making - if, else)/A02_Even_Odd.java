import java.util.Scanner;

public class A02_Even_Odd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no ");
        int no=sc.nextInt();
        if(no%2==0){
            System.out.println("No is even");
        }
        else{
            System.out.println("no is odd");
        }
    }
    
}
