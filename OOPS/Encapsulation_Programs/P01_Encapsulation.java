package OOPS.Encapsulation_Programs;

import java.util.Scanner;

class BankAccount {
    private int acc_No;private String acc_HolderName; private double balance;
    public void setAccountNumber(int x){
        this.acc_No=x;
    }
    public void setAccountHolderName(String x) {
        this.acc_HolderName=x;
    }
    public void setAccountBalance(double x){
        
        if (x>=0) {
            this.balance=x;
            System.out.println("set Balance successfully");
        } else {
            System.out.println("invalid Balance:");
        }
        
    }
    public int getAccountNumber(){
        return acc_No;
    }
    public String getAccountHolderName(){
        return acc_HolderName;
    }
    public double getAccountBalance(){
        
        return balance;
    }
    
}
public class P01_Encapsulation {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        //BankAccount bankAccount=new BankAccount();
       bankAccount.setAccountNumber(1012121393);
        //System.out.println(acc_No);
        bankAccount.setAccountHolderName("Pratik Adlinge");
        bankAccount.setAccountBalance(72345.89);     
        System.out.println("Account No:"+bankAccount.getAccountNumber());
        System.out.println("Account holder Name:"+bankAccount.getAccountHolderName());
        System.out.println("Account Balance :"+bankAccount.getAccountBalance());
        

    }
}
