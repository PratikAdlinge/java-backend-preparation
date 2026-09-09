package OOPS.Inheritance_Programs;

import java.util.Scanner;

class PAyment {
    double amount; int trans_id;
    Scanner sc=new Scanner(System.in);

    PAyment(){
        System.out.println("Enter Amount :");
        amount=sc.nextDouble();
        System.out.println("Enter Transcation Id:");
        trans_id=sc.nextInt();
    }
    void displayPayment() {
        System.out.println("Amount:"+amount);
        System.out.println("Transcation ID:"+trans_id);
    }
}

class UPIID extends  PAyment {
    String upiID;
    UPIID(){
        System.out.println("Enter UPI ID");
        upiID=sc.next();
    }
    void makeUpiPayment () {
        System.out.println("Payment has done through UPI");
    }
}
class CreditCard extends PAyment {
    int cardNo;String bankName;
    CreditCard () {
        System.out.println("Enter Card Number ");
        cardNo=sc.nextInt();
        System.out.println("Enter the Bank Name:");
        bankName=sc.next();
    }
    void makeCardPayment () {
        System.out.println("Payment has done by card");
    }
}
public class P12_HierarchicalInheritance_Practice {
    public static void main(String[] args) {
        UPIID upi=new UPIID();
        CreditCard card=new CreditCard();

        upi.displayPayment();
        upi.makeUpiPayment();

        card.displayPayment();
        card.makeCardPayment();
    }
}
