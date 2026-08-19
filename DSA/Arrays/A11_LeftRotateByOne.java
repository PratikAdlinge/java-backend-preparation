package DSA.Arrays;

import java.util.Scanner;

public class A11_LeftRotateByOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int size=sc.nextInt();
        if(size<0) {
            System.out.println("Array size must be greater than zero");
            return;
        }
        int numbers[]=new int[size];
        System.out.println("enter the elements of an array:");
        for (int i=0;i<numbers.length;i++) {
            numbers[i]=sc.nextInt();
        }
         int j=0; 
        int first=numbers[0];
        for (int i=1;i<numbers.length;i++) {
            
            numbers[j]=numbers[i];
            j++;


        }
        numbers[numbers.length-1]=first;
        
        for (int i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }
    }
    
}
