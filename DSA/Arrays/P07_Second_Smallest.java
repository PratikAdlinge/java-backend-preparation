import java.util.Scanner;

public class P07_Second_Smallest {
    public static void main(String[] args) {
        int arr1[]=new int [5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of an array:");
        for(int i=0;i<arr1.length;i++) {
            arr1[i]=sc.nextInt();
        }
        int smallestele=arr1[0];
        int secondSmallestEle=arr1[0];
        for(int i=1;i<arr1.length;i++){
            if (smallestele>arr1[i]) {
                secondSmallestEle=smallestele;
                smallestele=arr1[i];
            }
            else if (arr1[i]<secondSmallestEle && arr1[i] !=smallestele) {
                secondSmallestEle=arr1[i];
            }
        }
        System.out.println("Smallest Element is:"+smallestele);
        System.out.println("Second Smallest Element is:"+secondSmallestEle);
    }
}
