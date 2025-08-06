package strings;

import java.util.Scanner;

public class Read {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String name = sc.nextLine();

	        System.out.println("You entered: " + name );

	        sc.close();
	    }
}
