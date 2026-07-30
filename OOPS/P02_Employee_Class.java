package OOPS;
import java.util.*;

public class P02_Employee_Class{

    String name;
    int empId;
    float salary;
    String role;
    public void display(){
        System.out.println("Name of Employee : "+name);
        System.out.println("Employee ID No : "+empId);
        System.out.println("Salary Of an employee : "+salary);
        System.out.println("Role of an employee : "+role);

    }
    public static void main(String[] args) {

    P02_Employee_Class s1=new P02_Employee_Class();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the name of employee :");
    s1.name=sc.next();
    System.out.println("enter a employee id :");
    s1.empId=sc.nextInt();
    System.out.println("enter a salary of an employee :");
    s1.salary=sc.nextFloat();
    System.out.println("enter the role of an employee :");
    s1.role=sc.next();
    s1.display();

    
    }
    
}