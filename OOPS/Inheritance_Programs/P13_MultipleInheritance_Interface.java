package OOPS.Inheritance_Programs;

import java.util.Scanner;

interface Printable {
    void printInvoice();
}
interface Billable {
    void calculateBill();
}

class OnlineInvoice implements  Printable,Billable {
    String itemName;
    int quantity;
    double price;
    OnlineInvoice() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Item Name:");
        itemName=sc.next();

        System.out.println("Enter Quantity:");
        quantity=sc.nextInt();

        System.out.println(" Enter Price ");
        price=sc.nextDouble();
    }
    @Override 
    public void printInvoice() {
        System.out.println("Invoice for:"+itemName);
        System.out.println("Quantity:"+quantity);
        System.out.println("Price:"+price);
    }
    @Override 
    public void calculateBill() {
        double total=quantity*price;
        System.out.println("Total Bill:"+total);
    }
}
public class P13_MultipleInheritance_Interface {
    public static void main(String[] args) {
        OnlineInvoice order=new OnlineInvoice();
        order.printInvoice();
        order.calculateBill();
    }
}
