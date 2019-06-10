package ch4proj3TipCalculator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalcApp {

	public static void main(String[] args) {
		System.out.println("Tip Calculator \n");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Cost of meal: ");
			BigDecimal cost = sc.nextBigDecimal();
				for(double tp = .15; tp <= .25; tp +=.05) {
					BigDecimal perc = new BigDecimal(Double.toString(tp));
					BigDecimal tip = cost.multiply(perc);
					BigDecimal total = cost.add(tip);
					
					System.out.println(NumberFormat.getPercentInstance().format(perc));
					System.out.println("Tip Amount: " + NumberFormat.getCurrencyInstance().format(tip));
					System.out.println("Total: " +NumberFormat.getCurrencyInstance().format(total));
				}
		System.out.println("Continue? (y/n)");
		choice = sc.next();
		}
	}
}
