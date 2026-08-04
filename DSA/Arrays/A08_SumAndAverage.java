package DSA.Arrays;

import java.util.Scanner;

public class A08_SumAndAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of an array :");
        int size=sc.nextInt();
        int numbers[]=new int [size];
        System.out.println("enter an element of an array :");
        for (int i=0;i<size;i++) {
            numbers[i]=sc.nextInt();
        }
        int sum=0; double average=0;
        for (int i=0;i<numbers.length;i++) {
            sum+=numbers[i];

        }
        average=(double) sum/size;
        System.out.println("sum of all elements of an array is:"+sum+" average of an array is :"+average);
        
    }
}
