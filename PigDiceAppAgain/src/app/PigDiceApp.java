package app;

import java.util.Scanner;

public class PigDiceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Pig Dice App");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		int highscore = 0;
		int d = 0;
		while (choice.equalsIgnoreCase("y")) {
			highscore = 0;
			d = (int) ((Math.random() * 6) +1);
			while (d!=1) {
				highscore+=d;
				d = (int) ((Math.random() * 6) +1);
			}
			if (highscore==0) {
				System.out.println("Highscore: 1");
			}
			System.out.println("Highscore: " +highscore);
			System.out.print("Continue? (y/n) ");
			choice = sc.next();
		}
		System.out.println("Goodbye!");
	}

}
