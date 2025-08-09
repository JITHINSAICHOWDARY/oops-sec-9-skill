package immutability;
import java.util.Scanner;

public class Studentname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String fullName = sc.nextLine();

        String[] parts = fullName.split(" ");
        if (parts.length < 2) {
            System.out.println("Please enter both first and last name.");
            return;
        }

        String firstName = parts[0];
        String lastName = parts[1];

        StringBuffer sb = new StringBuffer(lastName);
        sb.reverse();

        System.out.println("Result: " + firstName + " " + sb);
    }
}
