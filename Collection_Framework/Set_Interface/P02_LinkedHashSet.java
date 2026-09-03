package Collection_Framework.Set_Interface;

import java.util.LinkedHashSet;

public class P02_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> marks=new LinkedHashSet<>();
        marks.add(90);
        marks.add(92);
        marks.add(89);
        marks.add(89);
        marks.add(78);

        System.out.println(marks);

        System.out.println("Size:"+marks.size());

        System.out.println("first ele:"+marks.getFirst());
         System.out.println("last ele:"+marks.getLast());
          System.out.println("remove ele:"+marks.remove(89));

          System.out.println(marks);

    }
}
