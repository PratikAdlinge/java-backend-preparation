package Collection_Framework.Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class P01_SetBasics {
    public static void main(String[] args) {
        Set<Integer>s1=new HashSet<>();

        s1.add(10);
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(30);
        Set<Integer>s2=new HashSet<>();
        s2.add(20);
        s2.add(30);

        System.out.println("Set 2:"+s2);


       System.out.println("Set 1:"+s1);
       System.out.println(s1.retainAll(s2)); 
       System.out.println(s1);
       System.out.println(s1.containsAll(s2));
    }
}
