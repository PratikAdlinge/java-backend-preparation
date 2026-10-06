package Exception_Handling;
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

        try {
             user.displayProfile();
        } catch (NullPointerException  e) {
            // TODO: handle exception
         System.out.println("user Profile is not available");    
         System.out.println("Please create a User object first.");
        }
        User u=new User();
        u.name="Pratik";
        u.email="pratikadlinge2121@gmail.com";
        u.displayProfile();
    }
}
