package ch5proj2DataValidation;

import java.util.Scanner;

public class DataValidationApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		double wid = getDoubleWithinRange(sc, "Enter width: ", 0, 60000);
		double len = getDoubleWithinRange(sc, "Enter length: ", 0, 60000);
		System.out.print("Area: " +(wid*len) +"\n"
				+"Perimeter: " +(wid*2)+(len*2));
		System.out.print("Continue? (y/n)");
		choice = sc.next();
		}
		
	}
	public static double getDoubleWithinRange(Scanner sc, String prompt, double min, double max ) {
		System.out.print(prompt);
		double num = sc.nextDouble();
		if (num<min||num>max) {
			System.out.println("Error number must be between "+min +" and " +max);
			System.out.print(prompt);
			System.out.println();
		}
		return num;
	}
}
