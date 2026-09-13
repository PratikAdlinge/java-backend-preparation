import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P05_Arraylist_details {
    public static void main(String[] args) {
        List <String> movies=new ArrayList<>();
        movies.add("KGF");
        movies.add("Toxic");
        movies.add("Mirzapur");
        movies.add("Pushpa");

        System.out.println(movies);
        Collections.sort(movies);
        System.out.println(movies);

        // sorting descending order

        Collections.sort(movies,(a,b)->b.compareTo(a)); 
        System.out.println(movies);

        System.out.println(movies.indexOf("KGF"));
       }
}
