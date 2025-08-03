package operators;
import java.util.Scanner;

public class Shift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter number of positions to shift: ");
        int shift = scanner.nextInt();
        int leftShift = num << shift;
        int rightShift = num >> shift;
        System.out.println("Original number: " + num);
        System.out.println("Left Shift (" + num + " << " + shift + "): " + leftShift);
        System.out.println("Right Shift (" + num + " >> " + shift + "): " + rightShift);
        scanner.close();
    }
}
