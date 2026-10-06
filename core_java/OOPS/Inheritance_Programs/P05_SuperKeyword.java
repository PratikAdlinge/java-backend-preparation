import java.util.Scanner;

class Employee1 {
    String emp_Name;double emp_Sal;
    Scanner sc=new Scanner(System.in);
    Employee1() {
        System.out.println("Enter the employee Name:");
        emp_Name=sc.next();
        System.out.println("Enter the employee salary");
        emp_Sal=sc.nextDouble();
    }
    void displayDetail() {
        System.out.println("Employee Name:"+emp_Name);
        System.out.println("Employee Salary:"+emp_Sal);
    }
}
class Manager1 extends Employee1 {
    String dept_Name;
    Manager1() {
        super();
        System.out.println("Enter Department name:");
        dept_Name=sc.next();
    }
    void displayManagerDetail(){
        super.displayDetail();
        System.out.println("Manager Name:"+super.emp_Name);
        System.out.println("Employee Name:"+super.emp_Name);
        System.out.println("Department Name :"+dept_Name);
        
    }
}
public class P05_SuperKeyword {
    public static void main(String[] args) {
        Manager1 manager1=new Manager1();
        manager1.displayManagerDetail();
    }
}
