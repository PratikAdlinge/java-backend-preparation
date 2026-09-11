import java.util.Scanner;

public class P02_SumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Size of an Array:");
        int size=sc.nextInt();
        int nos[]=new int[size];
        System.out.println("Enter elements of an array");
        for (int i=0;i<size;i++){
            nos[i]=sc.nextInt();
        }
        System.out.println("elments of array:");
        for (int i=0;i<size;i++) {
            System.out.println(nos[i]);
        }
        
        // sum of all elements in an array:
        int sum=0;

        for (int i=0;i<size;i++) {
            sum+=nos[i];
        }
        System.out.println("Sum of all elements is :"+sum);
        double average= (double)sum/size;
        System.out.println("Average of an array is:"+average);
        
    }
}

