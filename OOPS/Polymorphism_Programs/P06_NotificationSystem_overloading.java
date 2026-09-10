package OOPS.Polymorphism_Programs;
class Notification {
    String msg,receiver,urgent;

    void send(String msg) {
        this.msg=msg;
        System.out.println("Message is:"+msg);
    }
    void send(String msg,String receiver) {
        this.msg=msg;
        this.receiver=receiver;
        System.out.println("Message is:"+msg +" Receiver is:"+receiver);

    }
    void send(String msg,String receiver,String urgent) {
        this.msg=msg;
        this.receiver=receiver;
        this.urgent=urgent;

        System.out.println("Message is:"+msg+" Receiver is:"+receiver +"Priority of message:"+urgent);
    }
}
public class P06_NotificationSystem_overloading {
    public static void main(String[] args) {
        Notification n1=new Notification();
        n1.send("Interview is schedule at 3 pm:");
        n1.send("Interview Location is Pune.", "pratik@gmail.com");
        n1.send("Come 10 min early at interview location.","pratik@gmail.com","Urgent");
    }
}
