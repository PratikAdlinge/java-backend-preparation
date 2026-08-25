package Exception-Handling;
class User {
    String name,email;
    void displayProfile () {
        System.out.println(name);
        System.out.println(email);
    }
}
public class P01_NullPointerException {
    public static void main(String[] args) {
        User user=null;
        user.displayProfile();
    }
}
