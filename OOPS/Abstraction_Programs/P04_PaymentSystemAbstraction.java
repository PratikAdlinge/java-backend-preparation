package OOPS.Abstraction_Programs;
abstract class Payments {
    String customername;double amount;
    abstract void makePayment ();
    void paymentDetails (String name , double amt)  {
        customername=name;
        amount=amt;
        System.out.println("Customer Name:"+customername);
        System.out.println("Payment Amount:"+amount);

    } 
}
class UPI extends Payments {
    public void makePayment () {
        System.out.println("Payment Mode : UPI");
        System.out.println("UPI Payment Successful");

    }
}
class Creditcard extends Payments {
    public void makePayment () {
        System.out.println("Payment mode : Credit Card");
        System.out.println("Credit Card Payment Successfull");
    }
}
public class P04_PaymentSystemAbstraction {
    public static void main(String[] args) {
        Payments u1=new UPI();
        Payments c1=new Creditcard();

        u1.paymentDetails("Pratiksha", 10235);
        u1.makePayment();
        System.out.println();
        c1.paymentDetails("Pratik", 43223);
        c1.makePayment();

    }
}
