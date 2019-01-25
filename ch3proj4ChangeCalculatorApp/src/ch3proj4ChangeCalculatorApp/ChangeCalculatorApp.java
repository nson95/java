package ch3proj4ChangeCalculatorApp;

import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Change Calculator");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int q = 0;
		int d = 0;
		int n = 0;
		int p = 0;
		String choice = "y";
			while (choice.equalsIgnoreCase("y")) {
				System.out.println("Enter number of cents (0-99): ");
				int cent = sc.nextInt();
				while (cent>25) {
					q+=1;
					cent-=25;
				} while (cent>10) {
					d+=1;
					cent-=10;
				} while (cent>5) {
					n+=1;
					cent-=5;
				} while (cent>=1) {
					p+=1;
					cent-=1;
				} if (cent==0) {
					System.out.println("Quarters: " +q +"\r"
						+"Dimes:" +d +"\r"
						+"Nickels: " +n +"\r"
						+"Pennies: " +p);
				cent=0;
				System.out.println("Continue? (y/n) ");
				choice = sc.next();
				}
			}
			System.out.println("Goodbye!");
	}
}
