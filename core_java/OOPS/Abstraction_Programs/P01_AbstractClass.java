package OOPS.Abstraction_Programs;
abstract class Employee {
    abstract void calculateSalary () ;
    void displayCompany () {
        System.out.println("Company : Tata Consulting Services");

    }
}
class Developer extends Employee {  
    double basicSalary=50000,bonus=18909,totalSal;
    void calculateSalary() {
        totalSal=basicSalary+bonus;
        System.out.println("Developer Salary:"+totalSal);
    }
}
class Tester extends Employee {
    double basicSal=40000,bonus=10903,totSal;
    void calculateSalary() {
        totSal=basicSal+bonus;
        System.out.println("Tester Salary:"+totSal);
    }
}
public class P01_AbstractClass {
    public static void main(String[] args) {
        Developer developer=new Developer();
        Tester tester =new Tester();
        developer.displayCompany();
        developer.calculateSalary();
        tester.displayCompany();
        tester.calculateSalary();
    }
}
