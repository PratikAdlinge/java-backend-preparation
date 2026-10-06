package Collection_Framework.List.LinkedList;

import java.util.LinkedList;

public class P01_learnLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.offer("JAVA");// add element
        list.offer("PYTHON");
        list.offer("SQL");
        list.add("AWS");// add element
        System.out.println(list);

        System.out.println(list.get(3));

        System.out.println(list.contains("JAVA"));
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.peek());
        System.out.println(list.poll());
        
        System.out.println(list.peek());

        // Print element using for 
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        
    }
}
