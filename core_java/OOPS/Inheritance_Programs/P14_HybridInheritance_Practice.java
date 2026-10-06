package OOPS.Inheritance_Programs;
class Device {
    String brand="Samsung", model="j11";
    void displayDevice () {
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
    }
    
}

class Printer extends Device {
    int pages=100;
    void printDocument () {
        System.out.println("Print Pages Per Minute:"+pages);
    }

}
interface Scanabale {
    void scanDocument();

}
interface Faxable {
    void sendFax();

}

class SmartPrinter extends Printer implements  Scanabale, Faxable {
    @Override 
    public void scanDocument() {
        System.out.println("Document Scan succesfully:");
    }
    @Override 
    public void sendFax(){
        System.out.println("Fax sent successfully:");
    }
    //displayDevice();
}
public class P14_HybridInheritance_Practice {
    public static void main(String[] args) {
        SmartPrinter s1=new SmartPrinter();
        s1.displayDevice();
        s1.printDocument();

        s1.scanDocument();
        s1.sendFax();
    }
}
