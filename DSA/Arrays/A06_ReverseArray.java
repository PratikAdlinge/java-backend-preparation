package DSA.Arrays;

import java.util.Scanner;

public class A06_ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int size =sc.nextInt();
        int temp=0;
        int arr1[]=new int [size];
        System.out.println("enter the elements of an array:");
        for(int i=0;i<size;i++) {
            arr1[i]=sc.nextInt();
        }
        int left=0;
        int right=size-1;
        
        while (left<right) {
            
            temp=arr1[left];
            arr1[left]=arr1[right];
            arr1[right]=temp;
            left++;
            right--;
        }

        for (int i=0;i<size;i++) {
           System.out.println(arr1[i]); 
        }
        
    }

    
}
