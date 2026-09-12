import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class University {
    public int id;
    public String name;

    University(int id, String name) {
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return this.id+":"+this.name;
    }
}

public class P08_Collection_lambda {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(49);
        list.add(1);
        list.add(32);
        System.out.println("List is:"+list);

        //sorted list 
        Collections.sort(list);
        System.out.println(list);

        //descending order
        Collections.sort(list,(a,b)-> b-a);
        System.out.println("Descending order:"+list);

        Map<Integer,String> map=new TreeMap<>((a,b)->b-a);
        map.put(1, "Rajesh");
        map.put(4, "Pratik");
        map.put(2, "Satyam");
        map.put(3, "Sanket");
        
        //desc order 
        System.out.println(map);

        University u1=new University(101, "Pune University");
        University u2=new University(104, "Solapur University");
        University u3=new University(102, "Kolhapur University");
        University u4=new University(103, "Nagpur University");

        List<University> detail=new ArrayList<University>();
        detail.add(u4);
        detail.add(u2);
        detail.add(u3);
        detail.add(u1);
        System.out.println(detail);
        System.out.println("Desceding order:");
        Collections.sort(detail,(a,b)->b.id-a.id);
        System.out.println(detail);

        System.out.println("Ascending order:");
        Collections.sort(detail,(a,b)->a.id-b.id);
        System.out.println(detail);


        

    }
}
