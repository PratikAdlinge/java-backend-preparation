package MultiThreading;

class Thread1 extends  Thread {
    public void run () {
        String s1=Thread.currentThread().getName();
        for(int i=0;i<3;i++) {
            System.out.println(s1);
            Thread.yield();
        }
    }
}

class Thread2 extends Thread {
    public void run () {
        String s2=Thread.currentThread().getName();
        for (int i=0;i<3;i++){
             System.out.println(s2);
        }
    }
}
public class P06_YieldMethod {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();

        t1.setName("Pratiksha");
        t2.setName("Pratik");
        
        t1.start();
        t2.start();
    }
    
}
