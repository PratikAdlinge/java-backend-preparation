package OOPS.Inheritance_Programs;

import java.util.Scanner;

class Food {
    Scanner sc=new Scanner(System.in);

    String name ;double price;
        Food() {
        System.out.println("Enter Name of food");
        name=sc.next();
        System.out.println("Enter the price of food");
        price=sc.nextInt();
    }
    void displayFood(){
        System.out.println("Name of Food:"+name);
        System.out.println("Price of food:"+price);
    }
}

class Pizza extends Food {
    String size;String toppings;
        Pizza (){
        System.out.println("Enter The Size of an Pizza:");
        size=sc.next();
        System.out.println("Enter the toppings:");
        toppings=sc.next();
    }
    void displayPizza () {
        System.out.println("Size of Pizza:"+size);
        System.out.println("Toppings on pizza:"+toppings);
    }
}

class CheesePizza extends Pizza {
    String type,cheese;

        CheesePizza (){
        System.out.println("enter the cheese type");
        type=sc.next();
        System.out.println("Extra cheese or not");
        cheese=sc.next();
    }
    void displayCheesePizza(){
        System.out.println("Cheese type:"+type);
        System.out.println("Extraa Cheese:"+cheese);
    }
}
public class P11_MultilevelInheritance_Practice {
    public static void main(String[] args) {
        CheesePizza pizza=new CheesePizza();

        pizza.displayFood();
        pizza.displayPizza();
        pizza.displayCheesePizza();
    }
}
