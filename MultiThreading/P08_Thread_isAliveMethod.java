package MultiThreading;

class Students extends Thread {
    public void run() {
        System.out.println("isAlive Method program");
    }
}
public class P08_Thread_isAliveMethod {
    public static void main(String[] args) {
        Students t1=new Students();
        Students t2=new Students();

        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());

        System.out.println(t2.isAlive());
        t2.start();
        System.out.println(t2.isAlive());
    }
    
}
