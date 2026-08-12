package OOPS.Constructor_Programs;

import java.util.Scanner;

class Student {
    int rollno; double fees; String name;
    Scanner sc=new Scanner(System.in);
    Student(){
        System.out.println("Enter a roll no of student ");
        rollno=sc.nextInt();
        System.out.println("enter name of student");
        name=sc.next();
        System.out.println("enter fees of student");
        fees=sc.nextDouble();

        System.out.println("Student details:"+"name:"+name+"roll no:"+rollno+"fees :"+fees);
    }
    Student(int x){
        rollno=x;
        System.out.println("roll no is:"+rollno);
    }
    Student(double a, String b) {
        fees=a;
        name=b;
        System.out.println("fees:"+fees+"Name:"+name);
    }
}
public class P05_Constructor_overloading {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(101);
        Student s3=new Student(40000.89,"pratik");

    }
}
