import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class InterestCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter loan amount: ");
		BigDecimal loan = sc.nextBigDecimal();
		System.out.print("Enter interest rate: ");
		BigDecimal ir = sc.nextBigDecimal();
		
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("Loan amount: " +cf.format(loan));
		NumberFormat irf = NumberFormat.getPercentInstance();
		System.out.println("Interest rate: " +irf.format(ir));
		
		
		
		BigDecimal i = ir.multiply(loan).setScale(2, RoundingMode.HALF_UP);
		
		
		
		NumberFormat ff = NumberFormat.getCurrencyInstance();
		System.out.println("Interest: " +ff.format(i));
		
		
		
		System.out.println("goodbye..");
		
		
	}
}