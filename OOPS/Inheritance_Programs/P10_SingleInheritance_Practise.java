package OOPS.Inheritance_Programs;

import java.util.Scanner;

class Person123 {
    Scanner sc=new Scanner(System.in);
    String name; int age;
    Person123(){
    System.out.println("Enter Name And Age Of A person");
        name=sc.next();
        age=sc.nextInt();
 }

 void personDisplay() {
    System.out.println("Name OF Person:"+name);
    System.out.println("Age Of An Person:"+age);
 }
}
class Students1234 extends Person123
{
    int roll;String course;
    Students1234(){
        System.out.println("Enter Roll No and Course");
        roll=sc.nextInt();
        course=sc.next();

    }

    void displayStudent() {
        System.out.println("Roll No :"+roll);
        System.out.println("Course :"+course);
    }
}
class P10_SingleInheritance_Practise {
    public static void main(String[] args) {
        Students1234 s2=new Students1234();
        s2.personDisplay();
        s2.displayStudent();
    }
}