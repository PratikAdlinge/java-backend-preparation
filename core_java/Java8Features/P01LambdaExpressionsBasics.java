package Java8Features;

@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class P01LambdaExpressionsBasics {

    public static void main(String[] args) {

        Greeting g = () -> {
            System.out.println("Hello");
        };

        g.sayHello();
    }
}