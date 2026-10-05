import java.time.LocalDate;
import java.time.Month;

public class P15_Date_Time {
    public static void main(String[] args) {
        LocalDate now =LocalDate.now();
        System.out.println(now);
        LocalDate guddidate=LocalDate.of(2004,04,16);
        System.out.println(guddidate);
        int dayofmonth=now.getDayOfMonth();
        Month month=now.getMonth();
        int year=now.getYear();

        System.out.println(dayofmonth);
        System.out.println(month);
        System.out.println(year);
    }
}
