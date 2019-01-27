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
			
		}
	}
	
	public static int rollTheDice() {
		int ans = (int) ((Math.random() * 6) +1);
		return ans;
	}

}
