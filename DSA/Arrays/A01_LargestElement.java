package DSA.Arrays;

import java.util.Scanner;

public class A01_LargestElement {
    public static void main(String[] args) {                
    
    Scanner sc =new Scanner(System.in);
    int size;
    System.out.println("Enter the size of an array:");
    size=sc.nextInt();
    int arr1[]=new int[size];
    System.out.println("Enter the elements of an array:");
    for(int i=0;i<arr1.length;i++) {
        arr1[i]=sc.nextInt();

    }
    int largestElement=arr1[0];
    for(int i=1;i<arr1.length;i++) {
        if(largestElement<arr1[i]){
            largestElement=arr1[i];
        }
    }
    System.out.println("Arrays Elements are :");
    for(int i=0;i<arr1.length;i++) {
        System.out.println(arr1[i]);
    
    }
    System.out.println("Largest element in an array is:"+largestElement);
    }
}
