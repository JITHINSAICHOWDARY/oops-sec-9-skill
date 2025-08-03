package operators;
import java.util.Scanner;

public class Compund {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("\nInitial value: " + num);

        num += 5;
        System.out.println("After num += 5: " + num);

        num -= 3;
        System.out.println("After num -= 3: " + num);

        num *= 2;
        System.out.println("After num *= 2: " + num);

        num /= 4;
        System.out.println("After num /= 4: " + num);

        num %= 3;
        System.out.println("After num %= 3: " + num);

        scanner.close();
    }
}

