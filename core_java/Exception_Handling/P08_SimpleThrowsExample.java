package Exception_Handling;

public class P08_SimpleThrowsExample {
    public static void main(String[] args) throws InterruptedException {
         for (int i=0;i<10;i++) {
            System.out.println(i);
            Thread.sleep(1000);
         }
    }
}
