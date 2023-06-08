/*
import java.time.*;
import java.time.format.*;
public class exercise37 {


        //Given the follow code

    *public static void main(String[] args) {
     *   String str = "1986-04-08 12:30";
      *  DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
       * LocalDateTime dateTime = DateTime.parse(str, f); <---- es LocalDateTime no DateTime, por eso da error de compilation
        *    System.out.println(dateTime.plusDays(1).getDayOfWeek());
   * }
    */
/*
    *       Output?
    *   a- RunTime exception in compilation error in LocalDateTime dateTime = DateTime.parse(Str, f)
    *   b- RuntimeException in DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-mm-dd")
    *   c- Compilation error in DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm")
    *   d- Compilation error in localDateTime dateTime = DateTime.parse(str, f) <--- Correct answer
    *   e- Thursday
    *   f- Friday
*/
