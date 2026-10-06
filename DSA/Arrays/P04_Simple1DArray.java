import java.util.Scanner;

public class P04_Simple1DArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size;
        System.out.println("Enter size of an array:");
        size=sc.nextInt();

        int [] numbers=new int[size];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<numbers.length;i++) {
            numbers[i]=sc.nextInt();
        }

        System.out.println("Elements of an array:");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        } 

    }
}
