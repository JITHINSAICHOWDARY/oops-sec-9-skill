package assignment;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IN time (HOURS:MINUTES): ");
        String startStr = sc.nextLine();
        LocalTime start = LocalTime.parse(startStr);

        System.out.print("Enter OUT time (HOURS:MINUTES): ");
        String endStr = sc.nextLine();
        LocalTime end = LocalTime.parse(endStr);

        if (end.isBefore(start)) {
            end = end.plusHours(24);
        }

        Duration duration = Duration.between(start, end);

        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;

        System.out.println("Total hours worked: " + hours + " hours " + minutes + " minutes");

        sc.close();
    }
}
