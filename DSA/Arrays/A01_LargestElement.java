package DSA.Arrays;

import java.util.Scanner;

public class A01_LargestElement {
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int size;
    System.out.println("Enter the the size of an array");
    size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("enter the elements of array:");
    for(int i=0;i<arr.length;i++) {

        arr[i]=sc.nextInt();
        
    }
    int largest_Element=arr[0];
    for(int i=0;i<arr.length;i++) {

        if(largest_Element<arr[i]){
            largest_Element=arr[i];
        }
       // System.out.println("Element in Arrays:"+arr[i]);
    }
    System.out.println("Largest Element is:"+largest_Element);
        
    }
}
