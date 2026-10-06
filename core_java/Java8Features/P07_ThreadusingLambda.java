package Java8Features;

public class P07_ThreadusingLambda{
    public static void main(String[] args) {
    
        Runnable mythread= ()->{
            String name=Thread.currentThread().getName();
            System.out.println(name+" is Running ");
        };

        Thread run=new Thread(mythread);
        run.setName("thread1");
        run.start();

}
}