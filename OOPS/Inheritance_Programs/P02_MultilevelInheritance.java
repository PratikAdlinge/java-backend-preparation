package OOPS.Inheritance_Programs;

import java.util.Scanner;

class Employee {
    int emp_Id;String emp_Name;double emp_Sal;
    Scanner sc=new Scanner(System.in);
    void getEmployeeDetails(){
        System.out.println("Enter the name of employee:");
        emp_Name=sc.next();
        System.out.println("enter employee id:");
        emp_Id=sc.nextInt();
        System.out.println("enter the salary of employee:");
        emp_Sal=sc.nextDouble();
        
    }
}
class Manager extends Employee {
    int teamsize;
    void getManagerDetail(){
        System.out.println("enter team size");
        teamsize=sc.nextInt();
    }
    
    // void displayManagerDetails(){
    //     System.out.println("Employee ID:"+emp_Id);
    //     System.out.println("Employee name:"+emp_Name);
    //     System.out.println("Employee Salary:"+emp_Sal);
    //     System.out.println("Team Size:"+teamsize);
    // }
}
class Department extends Manager {
    String dept_Name;
    void getDepartmentDetail(){
        System.out.println("enter the Department name:");
        dept_Name=sc.next();

    }
    void displayDepartmentDetails() {
    System.out.println("Employee ID: " + emp_Id);
    System.out.println("Employee Name: " + emp_Name);
    System.out.println("Employee Salary: " + emp_Sal);
    System.out.println("Team Size: " + teamsize);
    System.out.println("Department: " + dept_Name);
}
}
public class P02_MultilevelInheritance {
    public static void main(String[] args) {
        Department department=new Department();
        department.getEmployeeDetails();
        department.getManagerDetail();
        department.getDepartmentDetail();
        //d1.displayManagerDetails();
        department.displayDepartmentDetails();
        
    }
    
}
