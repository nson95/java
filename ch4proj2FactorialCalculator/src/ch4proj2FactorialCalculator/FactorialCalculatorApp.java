package ch4proj2FactorialCalculator;

import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.println("Enter an integer that's greater than 0 and less than 10: ");
		int n = sc.nextInt();
		long ans = 1;
		for (int i = 1; i<=n; i++) {
			ans*=i;
		}
		System.out.println("The factorial of " +n +" is " +ans);
		System.out.print("Continue? (y/n) ");
		choice = sc.next();
		}
		System.out.println("Goodbye!");
	}

}
