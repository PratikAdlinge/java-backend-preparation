package Collection_Framework.Map_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student>list=new ArrayList<>();
       list.add(new Student(19,"pawan",65));
       list.add(new Student(22,"Sanket",60));
       list.add(new Student(23,"Nishant",62));
       list.add(new Student(23,"Pratik",68));
       
       System.out.println(list);
       Collections.sort(list);
       System.out.println();
       System.out.println(list);
    
    }
    
}
