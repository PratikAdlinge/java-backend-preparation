package MultiThreading;

class Pratik extends  Thread {
    public void run () {
        try {
            for (int i=0;i<5;i++){
        System.out.println("T1 Thread Running :");
        Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("T1 terminated..............");
        }
        
        }
      
    }
public class P09_interruptmethod {
    public static void main(String[] args) {
        Pratik t1=new Pratik();
        t1.start();
        t1.interrupt();
        
    }
    
}
