package Exception_Handling;

public class P03_TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("welcome:");
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("pratik");
        } catch (ArithmeticException e) {
            // TODO: handle exception
            //int x=10,y=0,z=0;
           // z=x/y;
            //System.out.println(z);
            System.out.println("cannot divide by 0");
        }
        finally {
            System.out.println("close file");
        }
        System.out.println("Pune");
    }
}
