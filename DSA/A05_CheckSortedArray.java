package DSA;

import java.util.Scanner;

public class A05_CheckSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        System.out.println("enter the elementsb of an array:");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        boolean issorted=true;
        for(int i=0;i<arr1.length-1;i++) {
            if (arr1[i]>arr1[i+1]) {
                issorted=false;
                
            }
        }
        if(issorted) {
            System.out.println("Array is Sorted :");
        }
        else {
            System.out.println("Arrayb is not Sorted:");
        }

    }
}
