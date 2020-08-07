package Day34_WrapperClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formator {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");

        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        System.out.println( today.format(dtf));
    }
}
