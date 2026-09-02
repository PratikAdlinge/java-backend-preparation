package Collection_Framework.List.LinkedList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class P02_TraverseLinkedList {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        System.out.println(list);

        Iterator<Integer> iterator=list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
