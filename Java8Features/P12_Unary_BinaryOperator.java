import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class P12_Unary_BinaryOperator {
    public static void main(String[] args) {

        Function <Integer,Integer> function= y -> y*y;
        UnaryOperator<Integer> unaryOperator= x-> x*x;
        System.out.println(unaryOperator.apply(10));
        System.out.println(function.apply(20));

        BiFunction <String,String,String> biFunction= (str1,str2) -> str1+str2;
        System.out.println(biFunction.apply("Pratik " , "Adlinge"));

        BinaryOperator <String> binaryOperator=(str1,str2)-> str1+str2;

        System.out.println(binaryOperator.apply("Pratiksha", " Koli"));
        

    }
}
