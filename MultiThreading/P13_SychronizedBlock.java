package MultiThreading;
  
class  Table {
    public  void Printable(int n){
        //synchronized (this) {
        for (int i=1;i<=10;i++){
            System.out.println(n*i);
       // }
    }
    }
}

class Threads1 extends Thread {
    Table t;
    Threads1(Table t){
        this.t=t;
    }
    public void run(){
        t.Printable(5);
    }
}
class Threads2 extends Thread {
    Table t;
    Threads2(Table t){
        this.t=t;

    }
    public void run (){
        t.Printable(8);
    }

}
public class P13_SychronizedBlock {
    public static void main(String[] args) {
        Table obj=new Table();
        Threads1 t1=new Threads1(obj);
        Threads2 t2=new Threads2(obj);

        t1.start();
        t2.start();


    }
}


