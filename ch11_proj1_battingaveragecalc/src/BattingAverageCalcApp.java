import java.util.Scanner;

public class BattingAverageCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Batting Average Calculator");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter number of times at bat: ");
			int numAB = sc.nextInt();
			System.out.println();
			
				
			int atBats[] = new int[numAB];
			for (int i = 0; i < atBats.length; i++) {
				System.out.println("Result for at-bat ");
				atBats[i] = sc.nextInt();
			}
			System.out.println(atBats);
			
		}
		
		
		System.out.println("Bye");

	}

}
