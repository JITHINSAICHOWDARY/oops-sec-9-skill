package Dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Addandsubstractdays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date (dd/mm/yyyy): ");
        String input = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(input, formatter);

        LocalDate plus30 = date.plusDays(30);
        LocalDate minus60 = date.minusDays(60);

        System.out.println("Original Date: " + date);
        System.out.println("Date after adding 30 days: " + plus30);
        System.out.println("Date after subtracting 60 days: " + minus60);

        sc.close();
    }
}
