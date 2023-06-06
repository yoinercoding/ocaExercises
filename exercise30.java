import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class exercise30 {
    public static void main(String[] args) {
        /*Calendar c = Calendar.getInstance();               //FORMA VIEJA
        Date d2 = new Date();

        LocalDate d = LocalDate.now();
        LocalDateTime t = LocalDateTime.now();            //FORMA NUEVA
        LocalDateTime dt = LocalDateTime.now();*/

        LocalDate date = LocalDate.of(1998, Month.JANUARY, 19);
        LocalTime time = LocalTime.of(8,50,1);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        date = LocalDate.parse("01-19-1998", f);
        time = LocalTime.parse("12:06");
        System.out.println(date);
        System.out.println(time);
    }
}
