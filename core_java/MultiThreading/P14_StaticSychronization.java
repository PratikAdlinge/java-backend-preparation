package MultiThreading;
class Bank extends  Thread {
    static int balance=5000;
    int withdraw;
    Bank(int withdraw) {
        this.withdraw=withdraw;
    }
    public static synchronized void withdraw(int amount) {
        String name=Thread.currentThread().getName();
        if(amount<=balance) {
            System.out.println(name+" Withdraw Money...");
            balance=balance-amount;
        }
        else {
            System.out.println("Insufficient Funds..");
        }
    }
    public void run () {
        withdraw(this.withdraw);
    }
}
public class P14_StaticSychronization {
    public static void main(String[] args) {
        
    
    Bank obj=new Bank(5000);
    Thread t1=new Thread(obj);
    Thread t2=new Thread(obj);
    t1.setName("Pratiksha");
    t2.setName("Pratik");

    t1.start();
    t2.start();
    }
    
}
