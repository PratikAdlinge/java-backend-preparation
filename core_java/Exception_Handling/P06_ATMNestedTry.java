package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P06_ATMNestedTry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=50000;

        try {
            System.out.println("Enter Account Number:");
            int accountNo=sc.nextInt();
            System.out.println("Enter the withdrawal Amount:");
            int withdrawalAmt=sc.nextInt();
            try {
                 if(withdrawalAmt==0)
                    System.out.println("Invalid withdrawal amount.");

                 else if (withdrawalAmt>balance) {
                    System.out.println("Insufficient Balance:");
                    System.out.println("Available balance:"+balance);
                 } else {
                    int remainBal=balance-withdrawalAmt;
                    System.out.println("Withdraw Amount :"+withdrawalAmt + " Successfully");
                    System.out.println("Available balance :"+remainBal);
                 }
                 


                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
        } catch (InputMismatchException e) {
            // TODO: handle exception
        System.out.println("Invalid Input : please enter valid account number ");
        }
    }
}
