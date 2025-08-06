package strings;

import java.util.Scanner;

public class Object {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message ");
        String msg = sc.nextLine();

        System.out.println("Message: " + msg);
    }
}