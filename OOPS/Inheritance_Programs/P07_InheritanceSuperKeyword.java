package OOPS.Inheritance_Programs;
class Person {
    String name;int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayPerson(){
        System.out.println("The name of an Person:"+name);
        System.out.println("Age of an person:"+age);
    }
}
class Employees extends Person {
    String emp_id;double sal;
    Employees (String name,String emp_Id,double sal) {
        super(name,23);
        this.emp_id=emp_Id;
        this.sal=sal;
    }
    void displayEmployee() {
        super.displayPerson();
        System.out.println("Employee Id:"+emp_id);
        System.out.println("Salary of Employee:"+sal);
    }
}
public class P07_InheritanceSuperKeyword {
    public static void main(String[] args) {
        Employees emp=new Employees("Pratikshaa","pratik21@gmail.com",56908.89);
        emp.displayEmployee();
    }
}
