package operators;

import java.util.Scanner;

public class Logical {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("sub1 marks:");
		Boolean subject1 = sc.nextBoolean();
		System.out.print("sub2 marks:");
		Boolean subject2 = sc.nextBoolean();
		if ( subject1 && subject2 )
		     System.out.println("PASS");
		else
		     System.out.println("FAIL");
}
}
