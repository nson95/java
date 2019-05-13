import java.util.Scanner;

public class PallindromePracticeApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Pallidrome Checker");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Please enter a string");
			String str = sc.next();
			int len = str.length();
				for (int i = 0; i < len/2; i++) {
					if (str.charAt(i) != str.charAt(len-i-1)) {
					System.out.println("Not a pallindrome.");
					}
					System.out.println("Pallindrome here!");
				}
				System.out.println("Continue? (y/n)");
				choice = sc.next();
		}
	}
}