import java.util.Scanner;

public class A07_Leap_Year {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year");
        int year=sc.nextInt();
        if (year%4==0 || year%400==0) {
            System.out.println(year+"Year is leap");
            
        }
        else {
            System.out.println(year+"year is not leap");
        }
    }
}
