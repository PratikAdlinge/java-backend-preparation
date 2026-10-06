package OOPS.Polymorphism_Programs;
class Calculator {
    int add(int x,int y) {
        return x+y;
    }
    void add(int a,int b,int c) {
        int sum=a+b+c;
        System.out.println("Sum of three Integers:"+sum);
    }
    void add(double a,double b) {
        double sum=a+b;
        System.out.println("Sum of Two Double:"+sum);
    }
    void add(int a,double b){
        double sum=a+b;
        System.out.println("Sum of integer and double:"+sum);
    }
}
public class P01_MethodOverloading {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        int add=calculator.add(10, 20);
        System.out.println("Addition of two integer:"+add);
        calculator.add(100, 200, 300);
        calculator.add(90.9, 80.8);
        calculator.add(100, 45.60);
    }
}
