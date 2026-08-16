package OOPS.Constructor_Programs;

class Demo {

    int a; String name; boolean truee;
    Demo() {
        a=10000;
           name="pratik";
           truee=true;
     }
    void display() {
        System.out.println(a+" "+name+" "+truee);
    }

}

public class P01_DefaultConstructor {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.display();
    }
    
}
