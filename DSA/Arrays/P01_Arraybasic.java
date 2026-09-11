import java.util.Scanner;

public class P01_Arraybasic {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an Array:");
    int size=sc.nextInt();
    int number[]=new int[size];
    System.out.println("Enter the elements of an array:");

    for(int i=0;i<size;i++){
        number[i]=sc.nextInt();
    }

    System.out.println("Array Elements:");
    for (int i=0;i<size;i++) {
        System.out.println(number[i]);
    }
       //Largest element in an array 
       int largest_ele=number[0];
       for (int i=1;i<size;i++) {
        if (largest_ele <=number[i]) {
            largest_ele=number[i];
        }
       }
       
       System.out.println("Largest element of an array is:"+largest_ele);
       int smallest_ele=number[0];
       for (int i=1;i<size;i++) {
        if (smallest_ele>=number[i]) {
            smallest_ele=number[i];
        }

       }
       System.out.println("Smallest Element is "+smallest_ele);
       
    }
}
    