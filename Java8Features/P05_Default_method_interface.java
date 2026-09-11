package Java8Features;
interface DeviceControl {
    void turnon();
    void turnoff();

    default void reset(){
        System.out.println("Reset Succesfully");
    }
}
class SmartWatch implements DeviceControl {
    public void turnon() {
        System.out.println("Smart Watch Turned On.");
    }
    public void turnoff() {
        System.out.println("Smart Watch turned off");
    }
}
class SmartSpeaker implements DeviceControl {
    public void turnon(){
        System.out.println("Smart Speaker turned onn...");
    }
    public void turnoff() {
        System.out.println("Smart Speaker turned off..");
    }
}

public class P05_Default_method_interface {
    public static void main(String[] args) {
        DeviceControl watch=new SmartWatch();
        DeviceControl speaker=new SmartSpeaker();

        watch.turnon();
        watch.turnoff();
        watch.reset();

        System.out.println();

        speaker.turnon();
        speaker.turnoff();
        speaker.reset();
    }
}
