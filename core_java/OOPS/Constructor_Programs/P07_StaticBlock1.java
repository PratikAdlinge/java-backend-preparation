package OOPS.Constructor_Programs;
class Demo {
    Demo() {
        System.out.println("Adlinge");
    }
    {
        System.out.println("Vasant");
    }
    static{
        System.out.println("Pratik");
    }
}
public class P07_StaticBlock1 {
    public static void main(String[] args) {
        Demo d=new Demo();
    }
}
