package OOPS.Inheritance_Programs;
class Product{
    String productName;double price;
    Product (String productName,double price) {
        this.productName=productName;
        this.price=price;
   }
   void displayProduct() {
    System.out.println("Product Name Is:"+productName);
    System.out.println("Price of Product:"+price);
   }
}
class ElectronicProduct extends Product{
    String brand;
    int warranty;
    ElectronicProduct (String productName,double price,String brand,int warranty) {
    this.brand=brand;
    this.warranty=warranty;
    }
    
}
public class P08_OnlineShoppingMultilevel {
    public static void main(String[] args) {
        
    }
}
