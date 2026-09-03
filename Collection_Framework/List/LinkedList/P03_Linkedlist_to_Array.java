package Collection_Framework.List.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class P03_Linkedlist_to_Array {
    public static void main(String[] args) {
        List<String> names=new LinkedList<>();
        names.add("Pratiksha");
        names.add("Sejal");
        names.add("Guddi");
        names.add("Bandya");

        System.out.println(names);

       Object obj[]= names.toArray();
       for (Object object : obj) {
        System.out.println(object);
       }
       //add first and add last
       names.addFirst("Pratik");
       names.addLast("Panda");
       System.out.println(names);
    }
}
