package MultiThreading;

class Student extends Thread {
   @Override 
    public void run () {
        
            try {
                 for (int i=0;i<5;i++) {
                    System.out.println("Pratiksha:");
                    Thread.sleep(1000);
                 }
            
                }
            catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println("Handle Exception");
            }
            
            
        
    }
}
public class P01_SimpleThread {
    public static void main(String[] args) throws InterruptedException{
        Student t1=new Student();
        t1.start();
        for (int i=0;i<5;i++) {
            System.out.println("Pratik:");
            Thread.sleep(1000);
        }
    }
}

