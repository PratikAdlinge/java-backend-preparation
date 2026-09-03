package Collection_Framework.Set_Interface;

import java.util.Set;
import java.util.TreeSet;

public class P03_TreeSet {
    public static void main(String[] args) {
        
        Set<Integer> numbers=new TreeSet<>();

        numbers.add(343);
        numbers.add(890);
        numbers.add(102);
        numbers.add(342);
        numbers.add(10);
        numbers.add(102);
        numbers.add(10);

        System.out.println(numbers);

        System.out.println("Size:"+numbers.size());

        System.out.println("remove ele"+numbers.remove(10));

        System.out.println("After removing :"+numbers);
    }
}
