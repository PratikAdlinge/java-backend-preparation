package OOPS.Constructor_Programs;
class Branch {
    int a,b; String c;
    Branch(int x,int y) {
        a=x;
        b=y;
    }
    Branch(int x,String s) {
        a=x;
        c=s;
        System.out.println(a+" "+c);
    }
    void show() {
        System.out.println(a+" "+b);
    }
}
public class P02_ParameterizedConstructor {
    public static void main(String[] args) {
        Branch branch=new Branch(100, 200);
        Branch b=new Branch(1000, "pratik ");
        branch.show();
    }
}
