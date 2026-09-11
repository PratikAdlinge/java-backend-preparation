package Java8Features;
interface Calculator {
    void calculate(int a,int b);
}
public class P03_Calculator_Lambda {
    public static void main(String[] args) {
        Calculator cal=(a,b)->{System.out.println("Multiplication:"+a*b);};
        cal.calculate(8,7);
    }
}
