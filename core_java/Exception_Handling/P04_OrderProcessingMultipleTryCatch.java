package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P04_OrderProcessingMultipleTryCatch {
    public static void main(String[] args) {
        int orderId;int price=0,avg=0;int quantity=0;
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter Order Id:");
            orderId=sc.nextInt();
            System.out.println("Enter Quantity of Product:");
            quantity=sc.nextInt();
            System.out.println("Enter Price Of Product:");
            price=sc.nextInt();
            
        } catch (InputMismatchException  e) {
            // TODO: handle exception
            System.out.println(e);
            System.out.println("Invalid input! Please enter numbers only.");
        }

        try {
            int totalAmt=quantity*price;
            avg=totalAmt/quantity;
        
            System.out.println(avg);


        } catch (ArithmeticException  e) {
            // TODO: handle exception
            System.out.println(e);
            System.out.println("Quantity cannot be zero.");
        }

        try {
            String product[]=new String[5];
            System.out.println("Enter the products");
            for( int i=0;i<product.length;i++) {
                product[i]=sc.next();
            }
            System.out.println("Enter the product index:");
            int index=sc.nextInt();
            System.out.println(product[index]);
        } catch (ArrayIndexOutOfBoundsException  e) {
            // TODO: handle exception
            System.out.println(e);
            System.out.println("Invalid Product Index");
            System.out.println("please select a valid product:");

        }
    }
}
