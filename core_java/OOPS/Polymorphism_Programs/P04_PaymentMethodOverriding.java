package OOPS.Polymorphism_Programs;
class Payment {
    void makePayment (double amount) {
        System.out.println("Processing Payment");
        System.out.println("Payment Amount"+amount);

    }
}
class UPI extends Payment {
    @Override
    void makePayment(double amt) {
        super.makePayment(amt);
        System.out.println("UPI Payment");
        System.out.println(amt);
        System.out.println("Payment Successfull using UPI");
    }
}
class Creditcard extends Payment {
    @Override
    void makePayment(double amt) {
        System.out.println("Credit Card");
        System.out.println("Amount:"+amt);
        System.out.println("Payment Successfull using Credit Card");
    }
}
class CashonDelivery extends Payment {
    @Override
    void makePayment(double amt) {
        System.out.println("Cash on Delivery");
        System.out.println("Amount:"+amt);
        System.out.println("Payment will be collected on delivery");

    }
}
public class P04_PaymentMethodOverriding {
    public static void main(String[] args) {
        Payment p1=new UPI();
        Payment p2=new Creditcard();
        Payment p3=new CashonDelivery();

        p1.makePayment(1045);
        System.out.println();
        p2.makePayment(10483.87);
        System.out.println();
        p3.makePayment(980);


    }
}
