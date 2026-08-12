package OOPS.Constructor_Programs;

public class P04_PrivateConstructor {
    int a;double b;String c;
   public P04_PrivateConstructor() {
        a=1000;
        b=30.303;
        c="pratik";
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[] args) {
        P04_PrivateConstructor p=new P04_PrivateConstructor();
    }
}
