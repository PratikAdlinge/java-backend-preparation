package Java8Features;
interface StringProcessor {
    String processString(String str);
}
public class P04_StringLambdaexample {
    public static void main(String[] args) {
        StringProcessor sp=(str)->{return (str.toUpperCase());};
       System.out.println(sp.processString("Maharashtra")); 
    }
}
