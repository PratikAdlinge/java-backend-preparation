package OOPS;

import java.util.Scanner;

class Student {
    int rollno,sub1,sub2,sub3; String name;
    Scanner sc=new Scanner(System.in);
    void get(){
        System.out.println(" Enter the Roll No of a student :");
        rollno=sc.nextInt();
        System.out.println("enter the name of student :");
        name=sc.next();
        System.out.println("enter the marks of student in 3 subjects:");
        sub1=sc.nextInt();
        sub2=sc.nextInt();
        sub3=sc.nextInt();

    }
}
class Result extends Student {
    void displayResult() {
       
        System.out.println("Student name :"+name);
        System.out.println("Roll no :"+rollno);
        System.out.println("Subject1 marks :"+sub1);
        System.out.println("Subject2 marks :"+sub2);
        System.out.println("Subject3 marks:"+sub3);

    }
    void calculatePercentage() {
        double sum=sub1+sub2+sub3;
        double per=sum/3;
        System.out.println("Percentage :"+per);
    }
}

public class P01_SingleInheritance {
    public static void main(String[] args) {
        Result r=new Result();
         r.get();
        r.displayResult();
        r.calculatePercentage();
    }
    
}
