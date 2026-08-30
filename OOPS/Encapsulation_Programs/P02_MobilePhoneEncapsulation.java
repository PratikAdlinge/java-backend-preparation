package OOPS.Encapsulation_Programs;
class Mobilephone {
    private String brand,model;
    private double price;
    private int batteryPercentage;
    void setBrandname (String name) {
        this.brand=name;
    
    }
    void setModel (String model) {
        this.model=model;
    }
    void setPrice (double price) {
        this.price=price;
    }
    void setBatteryPercentage (int per) {
        this.batteryPercentage=per;
    }

    String getBrandname () {
        return brand;
    }
    String getModel () {
        return model;
    }
    double getPrice () {
        return price;
    }
    int getBatteryPercentage () {
        return batteryPercentage;
    }

    void display () {
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("price:"+price);
        System.out.println("baterry:"+batteryPercentage+"%");

    }
}
public class P02_MobilePhoneEncapsulation {
    public static void main(String[] args) {
        Mobilephone m1=new Mobilephone();

        
        
        m1.setBrandname("Samsung");
        m1.setModel("S20 Ultra");
        m1.setPrice(124950.45);
        m1.setBatteryPercentage(67);
        m1.getBatteryPercentage();
        m1.getBrandname();
        m1.getModel();
        m1.getPrice();

        

        m1.display();
    }
    
}
