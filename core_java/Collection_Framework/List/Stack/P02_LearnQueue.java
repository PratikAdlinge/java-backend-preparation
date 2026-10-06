package Collection_Framework.List.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class P02_LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        // adding queue elements 

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("Queue:"+queue);

        System.out.println(queue.poll());

        System.out.println(queue.size());

        System.out.println(queue.remove(20));

        System.out.println(queue);

        System.out.println(queue.peek());

    }
}
