package OOPS.Polymorphism_Programs;
class BillCalculator {
   void  calCulateBill(double price) {
        System.out.println("Bill Amount:"+price);
    } 
    void calCulateBill(double price ,int quantity) {
        double total=price*quantity;
        System.out.println("Quantity:"+quantity);
        System.out.println("Total Amount:"+total);

    }
        void calCulateBill(double price ,int quantity,double discount) {
           double total=price*quantity; double discountAmt=total*discount/100; 
            double finalAmt=total-discountAmt;
            System.out.println("Discount:"+discount);
            System.out.println("Discount Amount:"+discountAmt);
            System.out.println("Final Amount:"+finalAmt); 
            System.out.println();      
        }
        void calCulateBill(double price1,double price2) {
            System.out.println("Product 1 Price:"+price1);
            System.out.println("Product 2 Price:"+price2);
            double total=price1+price2;
            System.out.println("Total Amount:"+total);
        }
}
public class P03_FoodBillMethodOverloading {
    public static void main(String[] args) {
        BillCalculator b1=new BillCalculator();
        b1.calCulateBill(345.67);
        b1.calCulateBill(345.67,3);
        b1.calCulateBill(345.67,3,10);
        b1.calCulateBill(414.34, 340.56);

    }
}
