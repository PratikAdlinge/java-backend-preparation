package DSA.Arrays;

import java.util.Scanner;

public class A12_LeftRotateByK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Size of an array:");
        int size=sc.nextInt();

        int arr1[]=new int[size];
        System.out.println("enter the elements of an array:");
        for (int i=0;i<size;i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the kth position ");
        int k=sc.nextInt();
         for(int rotation=0;rotation<k;rotation++) {
                            int first = arr1[0];

             for (int i=1;i<arr1.length;i++) {

                    arr1[i-1]=arr1[i];

            }
            arr1[arr1.length-1]=first;
        }
        for (int i=0;i<arr1.length;i++) {
            System.out.println(arr1[i]);
        }
    }
    
}
