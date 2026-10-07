import java.util.Scanner;

public class P08_CheckArraySorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array :");
        int size=sc.nextInt();
        int sortedarray[]=new int[size];
        System.out.println("Enter Elements of an Array:");
        for(int i=0;i<size;i++) {
            sortedarray[i]=sc.nextInt();
        }
        System.out.println("Array Elements:");
        for(int i=0;i<size;i++) {
            System.out.println(sortedarray[i]);

        }
        boolean stmt=false;
         for(int i=0;i<size-1;i++) {
            if (sortedarray[i]>sortedarray[i+1]) {
                System.out.println("Array is not sorted");
                stmt=true;
                break;
            }
         }
         if (stmt==false) {
          System.out.println("Arrays is Sorted");
           
         }
    }
}
