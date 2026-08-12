package OOPS.Constructor_Programs;

class Demo {

    int a; String name;
    // Demo() {
    //     a=0;
    //     name=null;
    // }
    void display() {
        System.out.println(a+" "+name);
    }

}

public class P01_DefaultConstructor {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.display();
    }
    
}
