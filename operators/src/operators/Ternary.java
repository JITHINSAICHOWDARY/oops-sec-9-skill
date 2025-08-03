package operators;
import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        int max = (a > b) ? a : b;
        System.out.println("The greater number is: " + max);
        scanner.close();
    }
}
