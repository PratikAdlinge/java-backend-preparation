public class P06_SecondLargest_Smallest {
    public static void main(String[] args) {
        int arr[]={10,20,2,43,24};
        System.out.println("Array element is:");
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

        int largestEle=arr[0];
        int secondLargestEle=arr[0];

        for(int i=1;i<arr.length;i++) {
            if (largestEle<arr[i]) {
                secondLargestEle=largestEle;
                largestEle=arr[i];
                
            }
            else if (arr[i]>secondLargestEle && arr[i] !=largestEle) {
                secondLargestEle=arr[i];
            }
        }
        System.out.println("Largest Element is:"+largestEle);
        System.out.println("Second Largest Element is:"+secondLargestEle);
    }
}
