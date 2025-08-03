package Control;
import java.util.Scanner;
public class Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter number");
        do {
            num = scanner.nextInt();
            if (num != 0) {
                System.out.println("You entered: " + num);
            }
        } while (num != 0);
        System.out.println("Program ended.");
        scanner.close();
    }
}
