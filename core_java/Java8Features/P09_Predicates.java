package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class P09_Predicates {
    public static void main(String[] args) {
        Predicate <Integer>p1=x->x>1000;
        System.out.println(p1.test(2000));

        Predicate <Integer> p2=x-> x % 2==0;
            System.out.println(p2.test(100));

            List<Integer> list=Arrays.asList(10,20,30,40,50);
            int sum =list.stream().filter(x -> x % 2==0).mapToInt(n->n).sum();
            System.out.println(sum);
            Predicate <String> predicate=x -> x.toLowerCase().charAt(0) =='p';
            System.out.println(predicate.test("Pratik"));

            //Default and static methods 
            Predicate <String> starPredicate=x -> x.toLowerCase().charAt(0) =='p';
            Predicate <String> endpredicate=x -> x.toLowerCase().charAt(x.length()-1) =='k';
            Predicate <String> and = starPredicate.and(endpredicate);
            System.out.println(and.test("Pratiksha"));
            //negate()
            System.out.println("negate");

            System.out.println(starPredicate.negate().test("pratiksha"));

            Predicate <Integer> lessthan0=x-> x<0;
            Predicate <Integer> greaterthan100=x-> x>100;
            //or()
            System.out.println(lessthan0.or(greaterthan100).test(150));
            //isequal()

            Predicate <String> str= Predicate.isEqual("java");
            System.out.println(str.test("java"));


        }
    }

