package operators;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take two integer inputs
        System.out.print("Enter first number a: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number b: ");
        int b = scanner.nextInt();

        // Bitwise operations
        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;
        int complementA = ~a;
        int complementB = ~b;

        // Display results
        System.out.println("\nBitwise AND (a & b): " + andResult);
        System.out.println("Bitwise OR (a | b): " + orResult);
        System.out.println("Bitwise XOR (a ^ b): " + xorResult);
        System.out.println("Bitwise Complement of a (~a): " + complementA);
        System.out.println("Bitwise Complement of b (~b): " + complementB);

        scanner.close();
    }
}
