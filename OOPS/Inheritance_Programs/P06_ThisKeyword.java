class Student1 {
    String name;int roll_No;double marks;
    Student1(String name,int roll_no,double marks) {
        this.name=name;
        this.roll_No=roll_no;
        this.marks=marks;

    }
    void display() {
        System.out.println("Student Name:"+name);
        System.out.println("Roll No:"+roll_No);
        System.out.println("marks:"+marks);
    }
    void show() {
        this.display();
    }

    Student1(){
        this("pratik",101,87.45);
    }
}

public class P06_ThisKeyword {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        Student1 s2=new Student1("Sejal",102,89.8);
        s1.show();
        s2.show();
    }
}
