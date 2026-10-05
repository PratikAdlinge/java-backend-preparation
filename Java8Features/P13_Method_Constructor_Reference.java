import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

import Collection_Framework.Map_Interface.Student;
class Test{


public static void print(String s){
    System.out.println(s);
}
}
public class P13_Method_Constructor_Reference {
    
    public static void main(String[] args) {
        List<String> students=Arrays.asList("Pratik","Pratiksha","Pratibha");
        students.forEach(Test::print);


    }
}
