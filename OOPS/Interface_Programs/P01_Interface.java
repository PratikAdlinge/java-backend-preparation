package OOPS.Interface_Programs;

import java.util.Scanner;

interface Client {
     void input();
     void output();
}
class Developer implements Client {
    Scanner sc=new Scanner(System.in);
    String name;double sal;
    @Override
    public void input() {
        System.out.println("Enter Employee Name:");
        name=sc.next();
        System.out.println("Enter the salary of Employee");
        sal=sc.nextDouble();
    }
    @Override
    public void output() {
        System.out.println("Employee Details:");
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Salary :"+sal);
    }
}
public class P01_Interface {
    public static void main(String[] args) {
        Client c1=new Developer();
        c1.input();
        c1.output();

    }
    
}
