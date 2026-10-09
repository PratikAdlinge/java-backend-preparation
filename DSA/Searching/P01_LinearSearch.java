import java.util.Scanner;

public class P01_LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter the elements of an array:");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        int searching_Item;
        System.out.println("Enter the element to check present or not in array:");
        searching_Item=sc.nextInt();
        int i=0,count =0;
        while (i<arr.length) {
            if (arr[i]==searching_Item) {
                System.out.println("Element found at index:"+ i);
                count++;
            }
            ++i;
        }
        if (count==0) {
            System.out.println("Element is not found");
            
        }
    }
}