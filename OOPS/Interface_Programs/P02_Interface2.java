package OOPS.Interface_Programs;
interface CustomerNishant {
    int amt=5;// public +static+final
    void purchase(); //public + abstract

}

class SellerSiddhu implements CustomerNishant {
    public void purchase() {
        System.out.println("Nishant purchase "+amt+"kg sugar from Siddu");

    }
}
public class P02_Interface2 {
    public static void main(String[] args) {
        CustomerNishant s1=new SellerSiddhu();
        s1.purchase();
    }
}
