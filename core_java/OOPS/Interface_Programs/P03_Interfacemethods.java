package OOPS.Interface_Programs;

interface Client {
    void webdesign();
    void webdevelop();

}

abstract class Sanket implements Client {
    public void webdesign(){
        System.out.println("Green , top menu ,navbar");
    }
}
class Nishant extends Sanket {
    public void webdevelop() {
        System.out.println("HTML,CSS ,JAVASCRIPT");
    }
}
public class P03_Interfacemethods {
    public static void main(String[] args) {
        Nishant nishant=new Nishant();
        nishant.webdesign();
        nishant.webdevelop();
    }
}
