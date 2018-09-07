import java.util.Scanner;

public class ch4_work_friday_consolemethodsapp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Console Methods App");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int a = promptForInt("Enter number a: ", sc);
		int b = promptForInt("Enter number b: ", sc);
		int c = promptForInt("Enter number c: ", sc);
		
		
		System.out.println("Numbers entered: " +a +", " +b +", " +c);
		System.out.println("bye");
		sc.close();

	}
	private static int promptForInt(String prompt, Scanner s) {
		
		System.out.print(prompt);
		int n = s.nextInt();
		
		return n;
	}

}
