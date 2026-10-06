package OOPS.Constructor_Programs;

class Demo {

    int a; String name; boolean t;
    Demo() {
        a=10000;
           name="pratik";
           t=true;
     }
    void display() {
        System.out.println(a+" "+name+" "+t);
    }

}

public class P01_DefaultConstructor {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.display();
    }
    
}
