import java.util.ArrayList;
import java.util.Scanner;

public class RanomArrayProjApp {

	public static void main(String[] args) {
		System.out.println("Welcome to my practice with arrays");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.print("Input a string ");
		Scanner sc = new Scanner(System.in);
		char[] letters = sc.next().toCharArray();
		System.out.println("Reverse String: ");
		for (int i = letters.length; i>=0; i--) {
			System.out.println(letters[i]);
		}
		System.out.println("Continue? (y/n)");
		choice = sc.next();
		}
		System.out.println("goodbye!");
		
		
		
		
	}

}
