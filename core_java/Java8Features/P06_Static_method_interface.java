package Java8Features;

interface AppUtility {
    void startApp();
    public static  void showVersion(){
        System.out.println("version -2.0139302");
    }
}

class MobileApp implements AppUtility {
    public void startApp(){
        System.out.println("Mobile App is started ...");
    }

}

class WebApp implements  AppUtility {
    public void startApp(){
        System.out.println("Web App is Started...");
    }
}
public class P06_Static_method_interface {
    public static void main(String[] args) {
        AppUtility mobile=new MobileApp();
        AppUtility webapp=new WebApp();

        mobile.startApp();
        AppUtility.showVersion();

        webapp.startApp();
        AppUtility.showVersion();
    }
}
