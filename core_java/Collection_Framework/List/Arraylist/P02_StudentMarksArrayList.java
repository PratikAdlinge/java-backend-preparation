

import java.util.ArrayList;
import java.util.Collections;

public class P02_StudentMarksArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(90);
        marks.add(89);
        marks.add(78);
        marks.add(56);
        marks.add(73);
        marks.add(66);

        System.out.println("All Students Marks:"+marks);

        System.out.println("total Number of Student is:"+marks.size());
        
        int max=Collections.max(marks);
        int min=Collections.min(marks);

        System.out.println("Highest Marks:"+max);
        System.out.println("Lowest Marks:"+min);
        int sum=0;
        for (Integer i : marks) {

            sum=sum+i;

        }
        double avg= (double)sum/marks.size();
        System.out.println("Average Marks of Student:"+avg);
         int count=0;
        for (Integer i : marks) {

            if (i>75) {
                count++;
            }
            

        }
        System.out.println("Student Above 75 is:"+count);

        System.out.println("Is Present 73:"+marks.contains(73));
         marks.set(2, 90);
         System.out.println("After Updating :\n"+marks);

         marks.remove(4);
         System.out.println("After Removing :\n"+marks);

         Collections.sort(marks);
         System.out.println("After Sorting:"+marks);

         
        }
    }

