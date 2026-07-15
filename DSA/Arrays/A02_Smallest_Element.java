import java.util.Scanner;

public class A02_Smallest_Element {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        System.out.println("Enter the elements in Array:");
        
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int smallestElement=arr1[0];
        for(int i=1;i<arr1.length;i++) {
            if(smallestElement>arr1[i]){
                smallestElement=arr1[i];
            }
        }
        System.out.println("Smallest Element in Array is:"+smallestElement);
    }
}
