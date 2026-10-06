package MultiThreading;

class Names extends Thread {
    public void run ()
    {
         String n=Thread.currentThread().getName();

        for (int i=0;i<3;i++){
        System.out.println(n);
    }
}
}
public class P03_ThreadSchedular {
    public static void main(String[] args) {
        Names t1=new Names();
        Names t2=new Names();
        Names t3=new Names();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
