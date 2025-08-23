package Dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Event {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the event date (dd/mm/yyyy): ");
        String input = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate eventDate = LocalDate.parse(input, formatter);
        LocalDate today = LocalDate.now();

        long days = ChronoUnit.DAYS.between(today, eventDate);

        if (days > 0) {
            System.out.println("The event is in " + days + " days.");
        } else if (days < 0) {
            System.out.println("The event occurred " + Math.abs(days) + " days ago.");
        } else {
            System.out.println("The event is today!");
        }

        sc.close();
    }
}
