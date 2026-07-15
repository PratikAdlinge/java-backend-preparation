import java.util.Scanner;

public class A03_SecondLargestEle {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        System.out.println("enter the elements in an array:");
        for(int i=0;i<arr1.length;i++) {
            arr1[i]=sc.nextInt();
        }
        int largest_Element=arr1[0];
        int SecondLarget=arr1[0];
        for(int i=0;i<arr1.length;i++) {
            if(arr1[i]> largest_Element){
                largest_Element=arr1[i];
            }
        }
        for(int i=0;i<arr1.length;i++) {
            if (arr1[i]!=largest_Element) {
                SecondLarget=arr1[i];
                
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>SecondLarget && arr1[i]!=largest_Element){
                SecondLarget=arr1[i];

            }
        }
        System.out.println("the Largest Element is:"+largest_Element+"the Second LargestElement is:"+SecondLarget);
    }
    
}
