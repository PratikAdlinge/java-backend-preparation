package Collection_Framework.List.Arraylist;

import java.util.ArrayList;

public class P04_List_to_Array1 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("AWS");
        System.out.println("Arraylist Elements:"+subjects);

        Object obj[]=subjects.toArray();
        System.out.println("Arrays Element:");
        for (Object object : obj) {
            System.out.println(object);

        }
    }
}
