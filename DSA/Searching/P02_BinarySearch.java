import java.util.Scanner;

public class P02_BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50};
        System.out.println("enter element check present or not in array");
        int item=sc.nextInt();
        int lowerele=0,mid,upperele=arr.length-1,count=-1;

        while (lowerele<=upperele) {
            mid = lowerele + (upperele - lowerele) / 2;
            if (arr[mid]==item) {
                count=mid;
                break;
            }
            if (arr[mid]<item) {
                lowerele=mid+1;
            }
            else{
                upperele=mid-1;
            }
        }
        if (count!=-1) {
            System.out.println("Element is found at index:"+count);
        }
        else{
            System.out.println("Element is not found.");
        }
    }
}
