

import java.util.Scanner;

public class GreatestCommonDivisorFinderApp {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Finder");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		int x = Console.getInt("Enter first number: ");
		int y = Console.getInt("Enter second number: ");
		int remainder = 0;
			while (x!=0) {
				while (x<=y) {
					y-=x;
				}
				remainder = x;
				x = y;
				y = remainder;	
			}
			System.out.println("Greatest common divisor: " +remainder);
			choice = Console.getString("Continue? (y/n) ");
			}
			System.out.println("goodbye");
		}

}
