package OOPS.Encapsulation_Programs;

import java.util.Scanner;

class Student {
    private String name; private  int rollno,mark;

    Student(String name ,int rollno, int mark){
        this.name=name;
        this.rollno=rollno;
        setMark(mark);
    }
    public void setName(String name) {
        this.name=name;
    }
     public void setRoll(int rollno) {
        this.rollno=rollno;
    }
     public void setMark(int mark) {
        if (mark>=0 && mark<=100) {
             this.mark=mark;
        } else {
            System.out.println("Invalid marks:");
        }
       
    }

    public String getName(){
        return name;
    }
    
    public int getRollno(){
        return rollno;
    }
    
    public int getMark(){
        return mark;
    }
    public void display (){
        System.out.println("Student Name:"+name);
        System.out.println("Roll No :"+rollno);
        System.out.println("Marks of Student:"+mark);

    }
}
public class P03_StudentEncapsulation {
    public static void main(String[] args) {
    Student s=new Student("Pratiksha",101,90);
    Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the Name of Student :");
    // String name=sc.next();

    // System.out.println("Enter Roll No of the Student:");
    // int roll=sc.nextInt();

    // System.out.println("enter marks of a student:");
    // int mark=sc.nextInt();

    // s.setName(name);
    // s.setRoll(roll);
    // s.setMark(mark);
    s.display();
    }
    
}
