package ch2proj3RectangleAreaCalculator;

import java.util.Scanner;

public class RectangleCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();
		String choice = "y";
			while (choice.equalsIgnoreCase("y")) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter length: ");
				double len = sc.nextDouble();
				System.out.println("Enter width: ");
				double wid = sc.nextDouble();
				System.out.println("Area: " +(len*wid) +"\r"
						+"Perimeter: " +(len+len)+(wid+wid));
				System.out.print("Continue? (y/n) ");
				choice = sc.next();
			}
			System.out.println("goodbye!");
		

	}

}
