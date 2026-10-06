package MultiThreading;

class Display extends Thread {
    public void run () {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

    }
}
public class p10_SetandGet_priorityMethod {
    public static void main(String[] args) {
        Display t1=new Display();
        Display t2=new Display();
        Display t3=new Display();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.setPriority(7);
        t2.setPriority(6);
        t3.setPriority(10);
        t1.start();
        t2.start();
        t3.start();
    }
}
