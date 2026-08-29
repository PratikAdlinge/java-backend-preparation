package OOPS.Inheritance_Programs;

class FoodOrder {
    int orderId;String customerName;double amt;
    FoodOrder (int orderId,String customerName,double amt) {
        this.orderId=orderId;
        this.customerName=customerName;
        this.amt=amt;
    }
    void displayOrder() {
    System.out.println("OrderId of a order:"+orderId);
    System.out.println("Customer Name :"+customerName);
    System.out.println("Amount of order:"+amt);
    }
}
class Onlineorder extends FoodOrder {
    String deliveryAdd;double deliveryCharge,finalAmt;
    Onlineorder (int orderId,String customerName,double deliveryCharge,String deliveryAdd,double amt) {
        super(orderId, customerName, amt);
        this.deliveryAdd=deliveryAdd;
        this.deliveryCharge=deliveryCharge;

    }
    void displayOnlineOrder() {
        finalAmt=amt+deliveryCharge;
        System.out.println("Online Order Details:");
        System.out.println("Order ID:"+orderId);
        System.out.println("Customer Name:"+customerName);
        System.out.println("Deliver Address is:"+deliveryAdd);
        System.out.println("delivery Charge is:"+deliveryCharge);
        System.out.println("Final Amount:"+finalAmt);
    }

}
class DineInorder extends FoodOrder {
    int tableno; int numberOfPeople;double finalAmt;
    DineInorder (int orderId,String customerName,double amt,int tableno,int numberOfPeople) {
        super(orderId, customerName, amt);
        this.tableno=tableno;
        this.numberOfPeople=numberOfPeople;
        
    }
    void displayDineOrder() {
        System.out.println("DineOrder Details:");
        System.out.println("Order ID:"+orderId);
        System.out.println("Customer Name:"+customerName);
        System.out.println("Total Bill:"+amt);
        System.out.println("Table Number:"+tableno);
        System.out.println("Number of people:"+numberOfPeople);


    }
}
public class P09_OnlineFoodHierarchical {
    public static void main(String[] args) {
    Onlineorder online=new Onlineorder(101, "pratik", 81.9,"pune ",401);
    DineInorder dine=new DineInorder(102, "Archana",1200, 20, 4);
    online.displayOnlineOrder();
    System.out.println();
    dine.displayDineOrder();
    }    
}
