package OOPS.Constructor_Programs;

import java.util.Scanner;

class Student121 {
    Scanner sc=new Scanner(System.in);
    Student121(){
        String name;
        System.out.println("Enter Student name:");
        name=sc.next();
        System.out.println("Name of Student :"+name);
    }
    Student121(int x){
        this("java",112009.489);

        int rollNo=x;
        System.out.println("Roll No of student is :"+rollNo);
    }
    Student121(String course,double fees) {
        
        
         System.out.println("Course of student "+course+"\n Fees of student : "+fees);


    }
}
public class P09_ConstructorThis {
    public static void main(String[] args) {
        Student121 S1=new Student121();
        Student121 S2=new Student121(101);

    }
}
