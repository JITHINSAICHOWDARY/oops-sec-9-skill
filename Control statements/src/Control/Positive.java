package Control;
import java.util.Scanner;
public class Positive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num > 0)
            System.out.println("positive.");
        else
            System.out.println("not positive.");
        scanner.close();
    }
}
