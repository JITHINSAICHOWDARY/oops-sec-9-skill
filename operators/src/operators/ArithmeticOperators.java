package operators;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number:");
		int a = sc.nextInt();
		System.out.print("Enter second number");
		int b = sc.nextInt();
		int sum = a+b ;
		System.out.println("ADDITION:" + sum);
		int sub = a-b;
		System.out.println("SUBTRATION:" +sub);
		int mul = a*b;
		System.out.println("MULTIPLATION:" + mul);
		int div = a/b;
		System.out.println("DIVISION: " + div);
		int mod = a%b;
		System.out.println("modulus:"+ mod);

	}

}
