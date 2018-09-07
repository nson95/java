import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class InterestCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter loan amount: ");
		double loan = sc.nextDouble();
		System.out.print("Enter interest rate: ");
		double ir = sc.nextDouble();
		
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("Formatted price = " +cf.format(loan));
		
		// BigDecimal i
		
		
		
		
		System.out.println("Loan amount: " +loan);
		
		
		System.out.println("goodbye..");
		
		

	}

}
