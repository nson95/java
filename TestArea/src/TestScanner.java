import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		System.out.println("Welcome");
		System.out.println("Please enter your number:");
		
		Scanner sc = new Scanner(System.in);
		double userNum = sc.nextDouble();
		
		System.out.println("Cool, goodbye!");

	}

}

