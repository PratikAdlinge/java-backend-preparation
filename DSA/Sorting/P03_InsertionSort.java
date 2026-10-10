package DSA.Sorting;

import java.util.Scanner;

public class P03_InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Elements of an Array:");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=1;i<size;i++){
            for(int j=i;j>=1;j--){
                if (arr[j-1]>arr[j]) {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array Elements:");
        for(int i=0;i<size;i++) {
            System.out.println(arr[i]);
        }
    }
}
