package OOPS;

import java.util.Scanner;

interface Programmer {
    void showProgrammingSkill();
}
interface Trainer {
    void showTrainingSkill();
}
class Employee implements Programmer,Trainer{
    Scanner sc=new Scanner(System.in);
    String sub,lang,name; int emp_Id;

 public  void showProgrammingSkill(){
    System.out.println("enter the programming lanaguage that you are master:");
     lang=sc.next();


  }
  public void showTrainingSkill() {
    System.out.println("enter the subject of training:");
    sub=sc.next();

  }
  public void getDetail(){
    System.out.println("enter employee name:");
    name=sc.next();
    System.out.println("enter employee id:");
    emp_Id=sc.nextInt();
  }
  public void displayDetails(){
    System.out.println("Employee ID:"+emp_Id);
    System.out.println("Employee Name:"+name);
    System.out.println("Programming Language:"+lang);
    System.out.println("Training Subject:"+sub);
  }
}

public class P03_MultipleInheritance {
    public static void main(String[] args) {
        Employee e1=new Employee();
        
        e1.showProgrammingSkill();
        e1.showTrainingSkill();
        e1.getDetail();
        e1.displayDetails();
    }
}
