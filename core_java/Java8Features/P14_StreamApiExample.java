import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P14_StreamApiExample {
    public static void main(String[] args) {
         List<Integer> list=Arrays.asList(1,2,3,5,6,7,8,9,11,2,32,32,3,22);

         List<Integer> list1Integers=list.stream()
         .filter(x-> x%2==0)
         .collect(Collectors.toList());

         System.out.println(list1Integers);
         List<Integer>mappedlist=list1Integers
         .stream()
         .map(x-> x/2)
         .distinct()
         .sorted((a,b)-> b-a)
         .limit(3)
         .skip(1)
         .collect(Collectors.toList());
         System.out.println(mappedlist);

         List<Integer>collect=Stream.iterate(0, x -> x+1)
         .limit(100)
         .filter(x-> x%2==0)
         .map(x-> x/2)
         .skip(0)
         .peek(x-> System.out.print(x))
         .collect(Collectors.toList());
        
         System.out.println(collect);



    }
}
