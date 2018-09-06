package ch3_proj1_tempconverter;

import java.util.Scanner;

public class TempConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.print("Enter degrees in Fahrenheit: ");
		double dgf = sc.nextDouble();
		
		double dgc = (dgf-32) * 5/9;
		System.out.println("Degrees in Celsius: " +dgc);
		
		
		System.out.println("continue (y/n)");
		choice = sc.next();
		}
		System.out.println("Goodbye!");

	}

}
