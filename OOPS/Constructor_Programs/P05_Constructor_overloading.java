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

        System.out.println("Student details: "+" name:"+name+" roll no:"+rollno+" fees:"+fees);
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
        Scanner sc=new Scanner(System.in);
        
        Student s1=new Student();
        System.out.println("enter roll no for 2nd constructor");
        int r=sc.nextInt();
        Student s2=new Student(r);
        System.out.println("enter the fees and name of student for 3rd constructor:");
        double f=sc.nextDouble();
        String s=sc.next();
        Student s3=new Student(f,s);

    }
}
