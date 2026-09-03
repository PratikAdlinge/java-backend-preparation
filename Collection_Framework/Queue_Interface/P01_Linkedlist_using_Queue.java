package Collection_Framework.Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class P01_Linkedlist_using_Queue {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();

        q.offer(10);
        q.offer(34);
        q.offer(5);
        q.offer(100);

        System.out.println("Queue:"+q);

        System.out.println(q.peek());
        
        System.out.println("size "+q.size());

        System.out.println("Removed element:"+q.poll());
    }

}
