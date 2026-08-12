package OOPS.Constructor_Programs;

class Book{
    int a;String b;
    Book() {
        a=100;
        b="pratik";
        System.out.println(a+" "+b);
    }
    Book(Book ref) {
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
}
public class P03_CopyConstructor {
    public static void main(String[] args) {
        Book b=new Book();
        Book b1=new Book(b);
    }   
}
