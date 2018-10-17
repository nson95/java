package com.TOP;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TableOfPowersApp {

	public static void main(String[] args) {
		SpringApplication.run(TableOfPowersApp.class, args);
		System.out.println("Welcome to the Table of Powers \n");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.print("Enter an integer: ");
		int i = sc.nextInt();
		String table = "";
		String headerRow = "Number\tSquared\tCubed\n";
		table+=headerRow;
		for (int n=1; n<=i; n++) {
			int squared = n*n;
			int cubed = n*n*n;
			String row = n+"\t"+squared+"\t"+cubed+"\n";
			table+=row;
		}
		System.out.println(table);
		System.out.print("Continue? (y/n) ");
		choice = sc.next();
		}
		
		
		
		
		
	}
}
