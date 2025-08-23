package Dateandtime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Noofdays {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate lastDate = LocalDate.of(today.getYear(), 12, 31);

        long daysRemaining = ChronoUnit.DAYS.between(today, lastDate);

        System.out.println("Today's Date: " + today);
        System.out.println("Last Date of Current Year: " + lastDate);
        System.out.println("Days Remaining in the Year: " + daysRemaining);
    }
}

