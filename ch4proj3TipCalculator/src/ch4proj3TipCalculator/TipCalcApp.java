package ch4proj3TipCalculator;

import java.math.BigDecimal;
import java.util.Scanner;

public class TipCalcApp {

	public static void main(String[] args) {
		System.out.println("Tip Calculator \n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Cost of meal: ");
		BigDecimal cost = sc.nextBigDecimal();
	}
}
