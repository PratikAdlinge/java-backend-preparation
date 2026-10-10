package DSA.Sorting;

import java.util.Scanner;

public class P02_Selectionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the Elements of an Array:");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int minIndex,temp;
        for(int i=0;i<size-1;i++) {
            minIndex=i;
            
            for(int j=i+1;j<size;j++) {
                if (arr[minIndex]>arr[j]) {
                    minIndex=j;
                    
                }

            }
            if (minIndex !=i) {
                 temp=arr[minIndex];
                 arr[minIndex]=arr[i];
                 arr[i]=temp;

            }
        }

        System.out.println("Sorted Array is:");
        for(int i=0;i<size;i++) {
            System.out.println(arr[i]);
        }

        
    }
}
