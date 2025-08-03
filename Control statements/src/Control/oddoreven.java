package Control;
import java.util.Scanner;
public class oddoreven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int num = scanner.nextInt();
        if (num % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
        scanner.close();
    }
}