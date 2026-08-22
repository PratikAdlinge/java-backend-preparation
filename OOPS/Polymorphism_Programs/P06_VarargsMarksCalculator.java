package OOPS.Polymorphism_Programs;
class MarksCalculator {
     
    void calculateMarks(int... marks) {
        int sub=marks.length;int total = 0;
        for (int i : marks) {
            total+=i;
        }
        float avgMarks=total/marks.length;

        System.out.println("Number of Subject:"+sub);
        System.out.println("Total Marks:"+total);
        System.out.println("Average of Marks:"+avgMarks);

    }
}

public class P06_VarargsMarksCalculator {
    public static void main(String[] args) {
        MarksCalculator m1=new MarksCalculator();
        m1.calculateMarks(100);
        m1.calculateMarks(100,33,44,72,54);
        m1.calculateMarks(73,67,57);
        
    }
}
