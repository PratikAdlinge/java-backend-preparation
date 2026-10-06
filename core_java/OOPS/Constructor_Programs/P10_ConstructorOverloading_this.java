package OOPS.Constructor_Programs;
class SIMCA{
    SIMCA(){
        System.out.println("Welcome to Simca");
        this("Tumch kalyan zal");
    }

    SIMCA(String str){
        System.out.println(str);
        this(68000,"varyvar gel");
    }

    SIMCA(int fees,String msg){
        System.out.println("Invested Money:"+fees);
        System.out.println(msg);

    }
}   

public class P10_ConstructorOverloading_this {
    public static void main(String[] args) {
        SIMCA s1=new SIMCA();
    }
}
