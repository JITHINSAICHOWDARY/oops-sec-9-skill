package operators;
import java.util.Scanner;
public class Comparing{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number:" );
    	int x =sc.nextInt();
    	System.out.print("Enter Second number:" );
    	int y =sc.nextInt();
        if (x > y)
            System.out.println("First number is greater");
        else if (x < y)
            System.out.println("Second number is greater");
        else
            System.out.println("Both numbers are equal");
    }
}