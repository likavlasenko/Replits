package Day33_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {

        LocalDate DOB = LocalDate.of(1994,11,22);
        // year-month-day
        System.out.println(DOB);

        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println("================================");

    LocalDate y = LocalDate.of(2020,1,1);
    boolean result = y.isLeapYear();
        System.out.println(result);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scan.nextInt();

        boolean result2 = LocalDate.of(year,1,1).isLeapYear();
        System.out.println(result2);

    }
}
