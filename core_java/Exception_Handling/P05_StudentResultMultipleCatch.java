package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P05_StudentResultMultipleCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;int totalMarks,sub,index;
        try {
            System.out.println("Enter Name of Student:");
            name=sc.next();
            System.out.println("Enter total marks of student:");
            totalMarks=sc.nextInt();
            System.out.println("Enter number of subject:");
            sub=sc.nextInt();
            int avg=totalMarks/sub;
            System.out.println(avg);
            String subjects[]={"Java","SQL","Python","DSA","Cloud"};
            System.out.println("Enter Subject index:");
            index=sc.nextInt();
            System.out.println(subjects[index]);


        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("Invalid input please enter valid");
            
        }
        catch (ArithmeticException e) {
            System.out.println("Enter valid no of Subject");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter valid index");
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("handled");
        }
    }
}
