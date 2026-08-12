package OOPS.Constructor_Programs;
class Student {
    
    String name; 
    {
        name="pratik";
        System.out.println("Student name in instance block:"+name);
    }
    Student() {
        name="Sejal";
        System.out.println("Student name in constructor:"+name);
    }

}
public class P06_InstanceBlocktest {
    public static void main(String[] args) {
        Student s1=new Student();
    }
}
