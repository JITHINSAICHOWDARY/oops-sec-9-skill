package Dateandtime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth date (dd/mm/yyyy): ");
        String input = sc.nextLine();

        String[] parts = input.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        LocalDate birthDate = LocalDate.of(year, month, day);

        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        System.out.println("Exact Age: " + age.getYears() + " years, "
                + age.getMonths() + " months, "
                + age.getDays() + " days");
        
        sc.close();
    }
}
