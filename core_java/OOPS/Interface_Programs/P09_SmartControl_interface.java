package OOPS.Interface_Programs;
interface SmartControl{
    void turnon();
    void turnoff();
}
class SmartTv implements SmartControl {
    public void turnon(){
        System.out.println("Smart tv is turned onn...");
    }
    public void turnoff(){
        System.out.println("Smart Tv turned off...");
    }
}

class SmartAc implements  SmartControl{

        public void turnon() {
            System.out.println("Smart Ac Turned Onn...");
        }
        public void turnoff(){
            System.out.println("Smart Ac Turned off...");
        }
}

class SmartFan implements  SmartControl {
    public void  turnon(){
        System.out.println("Smart Fan Turned On...");
    }
    public void turnoff() {
        System.out.println("Smart Fan Turned off...");
    }
}
public class P09_SmartControl_interface {
    public static void main(String[] args) {
    SmartControl smart=new SmartAc();
    SmartControl tv=new SmartTv();
    SmartControl fan=new SmartFan();

    smart.turnon();
    smart.turnoff();
    System.out.println();

    tv.turnon();
    tv.turnoff();

    System.out.println();

    fan.turnon();
    fan.turnoff();
    }
    

    
}
