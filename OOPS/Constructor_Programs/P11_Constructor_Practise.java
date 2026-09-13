package OOPS.Constructor_Programs;
class Movies {

    String name;
    Movies(String name) {
        this.name=name;
        System.out.println("Movie name is:"+name);
    }
}

class Budget extends  Movies {
    int amt;
    Budget(int amt) {
        super("Mirzapur");
        this.amt = amt;
        System.out.println("Movie Budget:" + amt);
    }
}
class CollectionAmt extends  Budget {
    int amount;
    CollectionAmt (int amount) {
        super(25000000);
        this.amount = amount;
        if (amount>this.amt) {
            System.out.println("Movie is Superhit and Blockblaster");
        }
        else {
            System.out.println("movie is flop");
        }
    }
}
public class P11_Constructor_Practise {
    public static void main(String[] args) {
        CollectionAmt amt=new CollectionAmt(250000000);
    }
}
