package ch5proj2DataValidation;

import java.util.Scanner;

public class DataValidationApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			double len = getDoubleWithinRange(sc, "Enter length: ", 0, 6000);
			System.out.println(len);
		}
				

	}
	
	public static double getDouble(Scanner sc, String prompt) {
		double num = 0;
		Boolean isValid = false;
		while (!isValid) {
			System.out.println(prompt);
			if (sc.hasNextDouble()) {
				isValid = true;
				num = sc.nextDouble();
			}
			else 
				System.out.println("Error, entry must be a number.");
		}
		return num;
	}
	
	public static double getDoubleWithinRange(Scanner sc, String prompt, double min, double max) {
		Boolean isValid = false;
		double num = 0;
		while (!isValid) {
			num = getDouble(sc, prompt);
			if (num<min) {
				System.out.println("Error, number must be more than " +min +".");
			}
			else if (num>max) {
				System.out.println("Error, number must be less than " +max +".");
			}
			else 
				isValid = true;
		}
		return num;
	}

}
