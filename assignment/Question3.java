package assignment;

	import java.util.Scanner;

	public class Question3{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter temperature in Celsius: ");
	        String input = sc.nextLine();

	        float f = Float.parseFloat(input);
	        double d = Double.parseDouble(input);
	        int i = (int) f;

	        System.out.println("As float: " + f);
	        System.out.println("As double: " + d);
	        System.out.println("As int: " + i);

	        sc.close();
	    }
	}

