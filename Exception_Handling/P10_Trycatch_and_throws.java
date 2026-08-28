package Exception_Handling;


public class P10_Trycatch_and_throws {
    void wait1() throws InterruptedException
     {
        for (int i=0;i<10;i++) {
            System.out.println(i);
            Thread.sleep(100);
        }
    }
    public static void main(String[] args) //throws Exception
     {
        P10_Trycatch_and_throws p=new P10_Trycatch_and_throws();
        try {
            p.wait1();
            System.out.println(10/0);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
            System.out.println("Handled...");

    }
}
