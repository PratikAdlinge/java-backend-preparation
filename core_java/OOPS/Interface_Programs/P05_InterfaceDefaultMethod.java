package OOPS.Interface_Programs;
interface A {
    void a1();
    void a2();
    default void a3 () {
        System.out.println("may or may not be need to implement me");
    }
}
class B implements A {
    public void a1 () {
        System.out.println("class B a1()");
    }
    public void a2 () {
        System.out.println("Class B a2()");
    }
    public void a3 () {
        System.out.println("Overriding in class B");
    }
}
class C implements A {
    public void a1() {
        System.out.println("class c a1()");
    }
    public void a2 () {
        System.out.println("class c a2()");
    }
}
class D implements A {
    public void a1 () {
        System.out.println("class d a1()");
    }
    public void a2 () {
        System.out.println("class d a2()");
    }
}
public class P05_InterfaceDefaultMethod {
    public static void main(String[] args) {
        B b=new B();
        C c=new C();
        D d=new D();

        b.a1();
        b.a2();
        b.a3();


        c.a1();
        c.a2();
        c.a3();

        d.a1();
        d.a2();
        d.a3();

    }
}
