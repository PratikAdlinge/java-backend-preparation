package OOPS.Interface_Programs;
interface SmartDevice {
    void turnOn();
    default void showDeviceInfo() {
        System.out.println("Smart device is connected to the home system.");
    }
}
class SmartTV implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart TV is turn on");
    }
}
class SmartAC implements SmartDevice {
    public void turnOn () {
        System.out.println("Smart AC is turn On.");
    }
    public void showDeviceInfo () {
        System.out.println("Smart AC is Connected.");
        System.out.println("Temperture Control is available");
    }
}
public class P06_SmartHomeDefaultMethod {
    public static void main(String[] args) {
        
    
    SmartTV s1=new SmartTV();
    SmartAC s2=new SmartAC();

    s1.turnOn();
    s1.showDeviceInfo();

    s2.turnOn();
    s2.showDeviceInfo();
}
}
