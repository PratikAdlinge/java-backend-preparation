package OOPS;

public class P01_Student_Class {
    String name;
    int rollNo;
    String address;
    public void display(){
        System.out.println("Student Name is:"+name);
        System.out.println("Student Roll no is:"+rollNo);
        System.out.println("Student Address is:"+address);
    }
    public static void main(String[] args){
        P01_Student_Class p1=new P01_Student_Class();
        p1.name="pratik";
        p1.rollNo=101;
        p1.address="Pune";
        p1.display();
    }
    }
    

