package DSA.Arrays;

import java.util.Scanner;

public class A09_MaxMinElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an size of an array:");
        int size=sc.nextInt();
        if (size <=0) {
            System.out.println("Array size must be greater than zero");
            return;
        }
        int arr1[]=new int[size];
        System.out.println("enter an element of an array:");
        for (int i=0;i<arr1.length;i++) {
            arr1[i]=sc.nextInt();
        }
        int maxElement=arr1[0];
        int minElement=arr1[0];

        for (int i=1;i<arr1.length;i++) {
            if (maxElement<arr1[i]) {

                maxElement=arr1[i];
                
            }
            if (minElement>arr1[i]) {
                minElement=arr1[i];
                
            }
        }
        System.out.println("Max element in an array is:"+maxElement+" min element in an array is:"+minElement);
    }
    
}
