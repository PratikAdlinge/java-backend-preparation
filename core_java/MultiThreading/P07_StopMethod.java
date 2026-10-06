package MultiThreading;

class Library extends Thread {
    public void run () {
        String name=Thread.currentThread().getName();
        for (int i=0;i<3;i++) {
            System.out.println(name);
        }
    }
}
public class P07_StopMethod {
    public static void main(String[] args) {
        Library t1=new Library();
        Library t2=new Library();
        Library t3=new Library();

        t1.setName("Thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();

        t2.start();
        
        t3.start();

        t2.stop();
    }
}
