import java.util.Scanner;

public class A04_SecondSmallest_Ele {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int size=sc.nextInt();
        int numbers[] =new int[size];
        System.out.println("Enter the Elements of an Array:");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        int smallestElement=numbers[0];
        int secondSmallestElement=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<smallestElement){
                smallestElement=numbers[i];
            }
        }
        for(int i=1;i<numbers.length;i++) {
            if(numbers[i]!=smallestElement){
                secondSmallestElement=numbers[i];
            }
        }
        for(int i=0;i<numbers.length;i++) {
            if (numbers[i]<secondSmallestElement && numbers[i]!=smallestElement) {
                secondSmallestElement=numbers[i];
            }
        }
        System.out.println("Smallest Element is:"+smallestElement+"Second Smallest Element is:"+secondSmallestElement);
    }
}
