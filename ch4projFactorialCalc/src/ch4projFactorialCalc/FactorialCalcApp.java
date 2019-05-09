package ch4projFactorialCalc;

import java.util.Scanner;

public class FactorialCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer that's greater than 0 and less than 10: ");
		int n = sc.nextInt();
		int ans = 1;
		for (int i=1; i<=n; i++) {
			ans*=i;
		}
		System.out.println("The Factorial of " +n +" is " +ans);
	}
	
}
