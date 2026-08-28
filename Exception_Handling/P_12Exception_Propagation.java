package Exception_Handling;

public class P_12Exception_Propagation {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public static void m1() {
        m2();
        
    }
    public static void m2(){
        System.out.println(10/0);
    }
}
