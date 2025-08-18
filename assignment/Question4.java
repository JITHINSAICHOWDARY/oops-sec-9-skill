package assignment;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean prime = true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime && n < 100 && n % 2 != 0 && n % 5 != 0)
            System.out.println(n + " satisfies all conditions.");
        else
            System.out.println(n + " does not satisfy all conditions.");
    }
}
