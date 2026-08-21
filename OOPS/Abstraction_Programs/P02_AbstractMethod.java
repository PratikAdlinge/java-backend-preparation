package OOPS.Abstraction_Programs;
 abstract class Shape {
    public abstract void calArea();
 }
 class Circle extends Shape {
    double r=10.34;
    public void calArea() {
        double area=3.14*r*r;
        System.out.println("area of circle:"+area);
    }
 }
 class Rectangle extends Shape {
    double l=24,b=12;
    public void calArea(){
        double area=l*b;
        System.out.println("Area of rectangle:"+area);
    }
 }
public class P02_AbstractMethod {
    public static void main(String[] args) {
        Shape cirShape=new Circle();
        Shape rShape=new Rectangle();
        cirShape.calArea();
        rShape.calArea();
    }
}
