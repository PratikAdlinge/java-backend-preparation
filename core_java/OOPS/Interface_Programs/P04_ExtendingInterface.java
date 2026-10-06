package OOPS.Interface_Programs;

interface Device {
    void poweron();
}
interface Smartdevice extends Device {
    void connectInternet();
}
class Smartphone implements Smartdevice {
    public void poweron() {
        System.out.println("Device is power on"); 
    }
    public void connectInternet(){
        System.out.println("Smartphone connected to Internet");
    }
}
public class P04_ExtendingInterface {
    public static void main(String[] args) {
        Smartdevice smartdevice=new Smartphone();
        smartdevice.poweron();
        smartdevice.connectInternet();
    }
}
