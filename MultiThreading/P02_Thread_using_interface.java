package MultiThreading;

class Colllege implements Runnable {
    public void run () {
        try {
            
            for (int i=0;i<5;i++) {
            System.out.println("Welcome to Simca:");
            Thread.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
       
    }
}
public class P02_Thread_using_interface {
    public static void main(String[] args) {
        Colllege col=new Colllege();
        Thread t1=new Thread(col);
        t1.start();
        
    }
}
