

import java.util.ArrayList;
import java.util.Iterator;

public class P01_LearnArraylist {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);
        list.add(2, 453);// add particular index

        System.out.println(list.size());// size of an arrylist
        try {
                   System.out.println(list.get(2)); // getting element with index

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        list.set(0,100); // set /Element update

        list.remove(2); // Index se remove

        System.out.println(list.contains(100));// Element present hai?

        System.out.println(list.lastIndexOf(104)); // Returns the last index of the element

        System.out.println(list.lastIndexOf(102));

        System.out.println(list.isEmpty());//Empty check
       

        
        
        System.out.println(list);
        list.clear();//All elements remove
        System.out.println(list);

        ArrayList<String> students=new ArrayList<>();
        students.add("Pratik");
        students.add("Nishant");
        students.add("Sanket");
        System.out.println(students);
        

        ArrayList<String> names=new ArrayList<>();
        names.add("pratiksha");
        names.add("Pratik");
        System.out.println(names);
        names.addAll(students); //Another collection add
        System.out.println("After adding another list:"+names); 


        System.out.println(names.containsAll(students));// All elements present?
        Iterator<String> it=names.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(names.toArray()); // Array mein convert
        System.out.println(names.removeAll(students));// Common elements remove
        System.out.println(names);

        


    }
}
