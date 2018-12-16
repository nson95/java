package ch12proj4StackCalculator;

import java.util.Scanner;

public class StackCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to the Stack Calculator");
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		StackCalculator stCalc = new StackCalculator();
		String choice = "";
		System.out.println("Commands: push , add, sub, mult, div, clear, or quit.");
		System.out.println("stack>");
		while (!choice.equalsIgnoreCase("quit")) {
			choice = sc.next();
			if (choice.equalsIgnoreCase("push")) {
				double num = Console.getDouble(" ");
				stCalc.push(num);
				choice = "";
			} else if (choice.equalsIgnoreCase("add")) {
				stCalc.add();
			} else if (choice.equalsIgnoreCase("sub")) {
				stCalc.subtract();
				System.out.println(stCalc.toString());
			} else if (choice.equalsIgnoreCase("mult")) {
				stCalc.multiply();
				System.out.println(stCalc.toString());
			} else if (choice.equalsIgnoreCase("div")) {
				stCalc.divide();
				System.out.println(stCalc.toString());
			} else if (choice.equalsIgnoreCase("clear")) {
				stCalc.clear();
				System.out.println(stCalc.toString());
			}
		} 
		System.out.println("Goodbye!");
	}

}
