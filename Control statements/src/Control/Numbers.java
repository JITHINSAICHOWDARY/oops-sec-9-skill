package Control;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
