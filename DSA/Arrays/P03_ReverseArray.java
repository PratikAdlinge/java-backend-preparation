public class P03_ReverseArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println("Array element:");
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Reverse Array is:");
        int arr2[]=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--) {
            arr2[j]=arr[i];
            j++;
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
