package ch3_proj1_tempconverter;

import java.util.Scanner;

public class TempConverterV2App {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter degrees in Fahrenheit: ");
			double degF = sc.nextDouble();
			double degC = (degF-32) * 5/9;
			System.out.print("Degrees Celcius: " +degC +"\n");
			System.out.println();
			System.out.print("continue? (y/n): ");
			choice = sc.next();
		}
		System.out.println("Alright I'm outta here");

	}

}
