package Exception_Handling;
/*
 * throw:
 * Used to explicitly throw an exception.
 * Example: throw new ArithmeticException("Can't divide by zero");
 *
 * throws:
 * Used in method declaration to declare an exception.
 * It passes exception-handling responsibility to the caller.
 *
 * throw  → throws the exception
 * throws → declares the exception
 */
public class P09_Throw_and_Throws  {
    void div (int a ,int b) throws ArithmeticException{
        if(b==0) {
           throw new ArithmeticException("can't divide by zero"); 
        }
        else {
            int c=a/b;
            System.out.println(c);
        }

    }
    public static void main(String[] args) throws ArithmeticException {
        P09_Throw_and_Throws p1=new P09_Throw_and_Throws();
        p1.div(10, 0);
    }
}
