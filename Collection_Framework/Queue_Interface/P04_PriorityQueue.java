package Collection_Framework.Queue_Interface;

import java.util.PriorityQueue;
import java.util.Queue;

public class P04_PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>((a,b)->b-a);//compaterator
        //bydefault integer priority is: min to max;
        pq.offer(19);
        pq.offer(10);
        pq.offer(5);
        pq.offer(30);

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
