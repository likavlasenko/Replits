package Day12_Switch_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;
/* hourRate = salary / (weeklyHour * 52)
 1 year = 52 weeks
 */

public class Rate_Calculator {
    public static void main(String[] args) {
        Scanner rate = new Scanner(System.in);
        System.out.println("Enter the salary:");
        double salary = rate.nextDouble();
        System.out.println("Enter how many hours you work per week: ");
        int hours = rate.nextInt(); // 40 hr/week
        int totalhrs = hours * 52;

        double hourlyRate = salary / totalhrs;

        System.out.println("Your hourly rate is: $"+hourlyRate);





    }
}
