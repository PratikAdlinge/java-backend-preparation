package OOPS.Constructor_Programs;
class Student1 {
    String name;int roll_No;double marks;
    Student1(String name,int roll_no,double marks) {
        this.name=name;
        this.roll_No=roll_no;
        this.marks=marks;

    }
    void display() {
        System.out.println("Student Name:"+this.name);
        System.out.println("Roll No:"+this.roll_No);
        System.out.println("marks:"+this.marks);
    }
    void show() {
        this.display();
    }

    Student1(){
        this("pratik",101,87);
    }
}


    
public class P08_ConstructorChaining {
 public static void main(String[] args) {
        Student1 s1=new Student1();
        Student1 s2=new Student1("Sejal",102,89.8);
        s1.show();
        s2.show();
    }   
}
