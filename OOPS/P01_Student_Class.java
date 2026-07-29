package OOPS;

public class P01_Student_Class {
    String name;
    int rollNo;
    String address;
    int age;

    public void displayStudentDetails(){
        System.out.println("Student Name "+name);
        System.out.println("Student RollNo"+rollNo);
        System.out.println("Student Address "+address);
        System.out.println("Student Age "+age);
     
    }
    public static void main(String [] args){
     
    P01_Student_Class s1=new P01_Student_Class();
    s1.name="Pratik";
    s1.rollNo=101;
    s1.address="Pune";  
    s1.age=22;
    s1.displayStudentDetails();
    }
    
}
