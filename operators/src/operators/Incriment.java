package operators;

import java.util.Scanner;

public class Incriment {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number:");
		int a = sc.nextInt();
        System.out.println((a++));
        System.out.println("After post-increment, a = " + a);
        System.out.println((a--));
        System.out.println("After post-decrement, a = " + a);
    }
}
