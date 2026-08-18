package OOPS.Inheritance_Programs;
class Product{
    String productName;double price;
    public Product (String productName,double price) {
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
    public ElectronicProduct (String productName,double price,String brand,int warranty) {
        super(productName, price);
        this.brand=brand;
        this.warranty=warranty;
    }
    void electonicProductDisplay () {
        System.out.println("Brand of Product is:"+brand);
        System.out.println("Warranty of a Product is:"+warranty);
    }

}
class Mobile extends ElectronicProduct {
    String os;int storage;
    Mobile (String productName,double price,String brand,int warranty,String os,int storage) {
        super(productName, price, brand, warranty);
        this.os=os;
        this.storage=storage;
    }
    void displayMobileDetails() {
        System.out.println("Product Name:"+productName);
        System.out.println("Price of Product:"+price);
        System.out.println("Brand of Product:"+brand);
        System.out.println("Warranty of Product"+warranty);
        System.out.println("Operating System of Product :"+os);
        System.out.println("Storage of Product:"+storage);
    }
}
public class P08_OnlineShoppingMultilevel {
    public static void main(String[] args) {
       Mobile mobile=new Mobile("Moto Edge 50 Fusion", 25000,"MOTOROLA", 1,"Android",256) ;
       mobile.displayMobileDetails();
       //System.out.println();
       mobile.displayProduct();
       System.out.println();
       mobile.electonicProductDisplay();
    }
}
