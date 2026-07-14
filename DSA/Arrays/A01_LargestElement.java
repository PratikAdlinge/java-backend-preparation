package DSA.Arrays;

import java.util.Scanner;

public class A01_LargestElement {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of an array:");
    int size=sc.nextInt();
    int arr[] =new int[size];
    System.out.println("enter elements of an array :");

    for(int i=0;i<arr.length;i++) {
        arr[i]=sc.nextInt();

    }
    int largest=arr[0];
    int secondLargest=arr[0];
    for(int i=0;i<arr.length;i++) {
        
      if(arr[i]>largest){
        secondLargest=largest;
        largest=arr[i];
      }
    }
    System.out.println(largest);
    System.out.println(secondLargest);

    } 
}
