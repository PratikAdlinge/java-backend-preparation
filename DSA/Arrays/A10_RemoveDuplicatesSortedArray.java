package DSA.Arrays;

public class A10_RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int arr1[]= {1,1,2,2,3,3,4,4,5};
        int uniqueElementCounter=0;
        int i=0;
        for (int j=1;j<arr1.length;j++) {
           
            if (arr1[i] !=arr1[j]) {
                i++;
                arr1[i]=arr1[j];
                
                //uniqueElementCounter++;
            }
        }
        
        for(int k=0;k<=i;k++) {
            System.out.println(arr1[k]);
        }
        System.out.println("Unique element count is: " + (i + 1));    }
    }

