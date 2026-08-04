package DSA.Arrays;

import java.util.Scanner;

public class A07_CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an size of an array:");
        int size=sc.nextInt();
        int numbers[]=new int [size];
        System.out.println("Enter elements of an array:");
        for (int i=0;i<numbers.length;i++) {
            numbers[i]=sc.nextInt();
            
        }
        int count_Even=0;
        int count_Odd=0;
        for (int i=0;i<numbers.length;i++) {
            if (numbers[i]%2==0) {
                count_Even++;
                
            }
            else {
                count_Odd++;
            }
        }
        System.out.println("the no of even no present in an array is:"+count_Even);
        System.out.println("the no of odd no present in an array is :"+count_Odd);


    }
}
