package Collection_Framework.Queue_Interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class P02_ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();

        dq.offer(10);
        dq.offerFirst(5);
        dq.offer(20);
        dq.offerLast(30);
        dq.offerFirst(2);
        

        System.out.println("Queue:"+dq);

        System.out.println(dq.peek());

        System.out.println(dq.removeFirst());

        System.out.println("Queue"+dq);

        System.out.println(dq.pollLast());
        System.out.println("Queue"+dq);

    }
}
