package OOPS.Interface_Programs;
interface OrderService {
    default void placeOrder () {
        validateOrder();
        System.out.println("Order places successfully.");
    }
    default void canselOrder () {
        validateOrder();
        System.out.println("Order cansel successfully.");
    }
    private void validateOrder () {
        System.out.println(" Validating Order............");
    }
}


public class P08_OrderServicePrivateMethod  implements OrderService{
    public static void main(String[] args) {
        P08_OrderServicePrivateMethod p1=new P08_OrderServicePrivateMethod();
        p1.placeOrder();
        p1.canselOrder();
    }
}
