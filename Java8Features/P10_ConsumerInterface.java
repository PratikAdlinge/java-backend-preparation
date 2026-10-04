import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class P10_ConsumerInterface {
    public static void main(String[] args) {
        Consumer<String> consumer=s-> System.out.println(s);
        consumer.accept("Pratik");

        Consumer <List<Integer>> listConsumer= li-> {
            for (Integer i : li) {
                System.out.println(i+100);
            }
        };
        listConsumer.accept(Arrays.asList(1,2,3,4));
    


    Consumer <List<String>> consumerlist= list-> {
        for (String s: list) {
            System.out.println(s);
        }
    };
    consumerlist.andThen(consumerlist).accept(Arrays.asList("Pratik","Pranav"));
    
} 
}
