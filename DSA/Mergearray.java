package DSA;

import java.util.Scanner;

public class Mergearray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of an array:");
    int size=sc.nextInt();


    int arr1[] =new int[size];
    System.out.println("enter elements of an array 1 :");
    for(int i=0;i<arr1.length;i++) {
        arr1[i]=sc.nextInt();

    }
    int arr2[] =new int[size];
    System.out.println("enter elements of an array 2 :");
    for(int i=0;i<arr2.length;i++) {
        arr2[i]=sc.nextInt();
    }

    int arr3[]=new int[arr1.length+arr2.length];
    for(int i=0;i<arr1.length;i++) {
        arr3[i]=arr1[i];
    }
    for(int i=0;i<arr2.length;i++) {
        arr3[arr1.length+i]=arr2[i];
    }
    for(int i=0;i<arr3.length;i++){
        System.out.print(arr3[i]+" ");
    }
}
}

