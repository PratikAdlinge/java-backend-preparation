package OOPS.Polymorphism_Programs;
class Animal {
    void sound(){
        System.out.println("Animal makes sound");
    }

}
class Dog extends Animal{
    @Override
    void sound(){
        super.sound();
        System.out.println("Dog Barks:");
    }
}
class Cat extends Animal{
         @Override    
         void sound(){
            super.sound();
            System.out.println("Cat Meows");
        }

}
public class P02_MethodOverriding {
    public static void main(String[] args) {
        Animal dog=new Dog();
        Animal c=new Cat();
        dog.sound();
        c.sound();
    }
}
