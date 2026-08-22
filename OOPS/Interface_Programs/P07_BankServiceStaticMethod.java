package OOPS.Interface_Programs;

import java.util.Scanner;

interface BankService {
    void deposit(double amount);
    static void validateAmount(double amount){
        if (amount>0) {
            System.out.println("Valid Amount.");
        } else { 
            System.out.println("InValid Amount.");
        }
    }
}
class SavingAccount implements BankService {
    public void deposit (double amount) {
        System.out.println(amount);
    }
}
public class P07_BankServiceStaticMethod {
    public static void main(String[] args) {
        SavingAccount s1=new SavingAccount();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount for deposite:");
        double amt=sc.nextDouble();
        BankService.validateAmount(amt);
        s1.deposit(amt);
    }
}
