import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		System.out.println("Welcome");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your number: ");
		double userNum = sc.nextDouble();
		System.out.print("Your number is " + userNum);
		System.out.println();
		System.out.println("Cool, right? Goodbye!");
		sc.close();

	}

}

