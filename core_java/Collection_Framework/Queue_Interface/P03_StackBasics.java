package Collection_Framework.Queue_Interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class P03_StackBasics {
    public static void main(String[] args) {
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack);

        System.out.println(stack.isEmpty());

    }
}
