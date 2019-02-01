package ch5proj1DiceRollerApp;

import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Dice Roller");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Roll the dice? (y/n): ");
		String choice = sc.next();
		while (choice.equalsIgnoreCase("y")) {
			int a = rollTheDice();
			int b = rollTheDice();
			if (a+b==12) {
				System.out.println("Die 1: " +a +"\r"
					+"Die 2: " +b +"\r"
					+"Boxcars!");
			} else if (a+b==2) {
				System.out.println("Die 1: " +a +"\r"
						+"Die 2: " +b +"\r"
						+"Snake Eyes!");
			} else 
				System.out.println("Die 1: " +a +"\r"
						+"Die 2: " +b);
			System.out.print("Continue? (y/n) ");
			choice = sc.next();
		}
		System.out.println("goodbye!");
		sc.close();
	}
	public static int rollTheDice() {
		int ans = (int) ((Math.random() * 6) +1);
		return ans;
	}
}
