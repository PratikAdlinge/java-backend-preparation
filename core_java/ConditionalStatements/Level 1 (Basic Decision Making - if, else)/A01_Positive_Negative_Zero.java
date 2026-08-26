import java.util.Scanner;

public class A01_Positive_Negative_Zero {

    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no ");
        int no=sc.nextInt();
        if (no==0) {
            System.out.println("number  is zero");
        
        }
        else if(no>0){
            System.out.println("number is positive");
        }
        else {
            System.out.println("no is negative");
        }
    }
}