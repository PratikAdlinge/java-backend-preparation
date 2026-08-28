package Exception_Handling;

import java.util.Scanner;
class InvalidInputException extends Exception {
    InvalidInputException(String msg) {
        super(msg);
    }
}
class InsufficientBalanceException extends Exception {
     InsufficientBalanceException( String msg) {
        super(msg);
     }
}
class CustomeException {
    int balance=50000;
    void withdraw(int amt) throws InvalidInputException,InsufficientBalanceException{
        if(amt==0) {
            throw new InvalidInputException("Enter valid amount");
        }
        else if (amt>50000) {
            throw new InsufficientBalanceException("Insufficient Fund:"+"Available Balance:"+balance);
            
        }
        else {
            System.out.println("Amount Withdraw Succesfully:");
            int availBal=balance-amt;
            System.out.println("Avaialble Balance Is:"+availBal);
        }
    }
    
 }
public class P11_InsufficientBalanceException {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter amount for withdrawal");
        int amt=Sc.nextInt();
        CustomeException c1=new CustomeException();
        try {
            c1.withdraw(amt);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
        

    }


}
