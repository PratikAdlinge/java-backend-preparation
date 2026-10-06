package Collection_Framework.List.Stack;

import java.util.Stack;

public class P01_LearnStack {
    public static void main(String[] args) {
        Stack<String>animals=new Stack<>();
        System.out.println(animals.empty());
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Horse");
        animals.push("Dog");
        System.out.println(animals.empty());

        System.out.println("Stack:"+animals);

        System.out.println(animals.peek());

        System.out.println(animals.pop());
        System.out.println("Stack:"+animals);

        System.out.println(animals.search("Horse"));
    }
}
