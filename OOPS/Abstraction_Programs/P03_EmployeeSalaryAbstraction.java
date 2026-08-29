package OOPS.Abstraction_Programs;

import java.util.Scanner;

abstract class Employee {
    String name; int id;double salary;
    Scanner sc=new Scanner(System.in);

    abstract void calculateSalary();
    void displayDetails1(String name,int id, double salary) {
        this.name=name;
        this.id= id;
        this.salary=salary;
        System.out.println("Employee Name:"+name );
        System.out.println("Employee ID:"+id);
        System.out.println("Basic Salary:"+salary);
    }
}
class FullTimeEmployee extends Employee {
    public void calculateSalary() {
        double bonus=14393.490;
        double totalSal=salary+bonus;
        System.out.println("Total Salary of Full time Employee:"+totalSal);
    }
}
class PartTimeEmployee extends Employee {
    public void calculateSalary () {
        System.out.println("Hour much hour he worked :");
        float hour=sc.nextFloat();
        double hourlyPay=193.23;
        double totalSal=hourlyPay*hour;
        System.out.println("Salary of an Employee:"+totalSal);
    }
}
public class P03_EmployeeSalaryAbstraction {
    public static void main(String[] args) {
        Employee f1=new FullTimeEmployee();
        Employee p1=new PartTimeEmployee();
        f1.displayDetails1("Pratiksha",101,100000.43);
        f1.calculateSalary();

        p1.displayDetails1("Pratik", 230, 34243.40);
        p1.calculateSalary();
    }
}
