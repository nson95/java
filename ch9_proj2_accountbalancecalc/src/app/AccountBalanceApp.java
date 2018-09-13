package app;
import java.text.NumberFormat;

import CheckingAccount;
import Console;
import SavingsAccount;

public class AccountBalanceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Account application");
		NumberFormat cf =NumberFormat.getCurrencyInstance();
		System.out.println();
		
		
		
		System.out.println("Starting balances: ");
		CheckingAccount ca = new CheckingAccount(1000);
		SavingsAccount sa = new SavingsAccount(1000);
		
		System.out.println("Checking: " +cf.format(ca.getBalance()));
		System.out.println("Checking: " +cf.format(sa.getBalance()));
		
		System.out.println("Enter the transactions for the month");
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			
			String transType = Console.getString();
			
			
			
			choice = Console.getString("Continue? (y/n)");
			
		}
		System.out.println("Bye!");

	}

}
