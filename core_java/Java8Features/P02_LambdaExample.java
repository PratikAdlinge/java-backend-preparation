package Java8Features;
interface DemoLambda {
    void method1();
}
public class P02_LambdaExample {
    public static void main(String[] args) {
        // DemoLambda d1=new DemoLambda() {
        //    public void method1(){
        //     System.out.println("Method 1 is Called..");
        //     }
        // };
        // d1.method1();
        DemoLambda d1=()->{System.out.println("this is a method1");};
        d1.method1();
    }
}
