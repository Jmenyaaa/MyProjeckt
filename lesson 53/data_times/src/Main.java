import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hello world!");
        LocalDate myToday = LocalDate.now();
        System.out.println(myToday);
        System.out.println();
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);
        System.out.println();
        LocalDateTime myDataTime = LocalDateTime.now();
        System.out.println(myDataTime);
        System.out.println();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDataTime.format(myFormatObj);
        System.out.println(formattedDate);

         */
        Table_reservation tr1 = new Table_reservation(1,true, );
        System.out.println(tr1);
    }
}