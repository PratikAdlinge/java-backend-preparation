package MultiThreading;

class ThreadNames extends Thread {
    public void run ()
    {
        try {
            String n=Thread.currentThread().getName();

        for (int i=0;i<3;i++){
        System.out.println(n);
        Thread.sleep(1000);
    }
        }
         catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Hnadled Exception:");
        }
        

       
}
}
public class P05_JoinMethod {

    public static void main(String[] args) {
        ThreadNames t1=new ThreadNames();
        ThreadNames t2=new ThreadNames();
        ThreadNames t3=new ThreadNames();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t2.start();

        try {
            t2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }

        t1.start();
        t3.start();
    }
}




