import java.util.Scanner;

public class GuessingGameApp {
	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			boolean correctGuess = false;
			int number = getRandomNumber();
			int counter = 0;
			while (!correctGuess) {
				int guess = getInt("Enter number", sc, 1, 100);
				counter++;
				//compare guess vs rando
				String resp = "";
				if (guess>number) {
					int diff = guess-number;
					if (diff>10) {
						resp = "Way too high!";
					} else {
						resp = "Too high!";
					}
				} else if (number>guess) {
					int diff = number - guess;
					if (diff>10) {
						resp = "Way too low!";
					} else {
						resp = "Too low!";
					}  
			
		
			} else {
				correctGuess = true;
				System.out.println("You got it in ("+counter+") guesses.");
			
			} if (counter<=3) {
				System.out.println("Great work! You are a mathematical wizard.");
				} else if (counter < 7) {
					System.out.println("Not too bad, you've got some potential!");
				} else {
					System.out.println("What took you so long? Maybe you should take"
							+"some lessons.");
				}
			choice = sc.next();
			
			System.out.println();
			System.out.println("Bye - Come back soon!");
		}
		
	
	}
		}
	// generate a random number between 1-100
	private static int getRandomNumber() {
		System.out.println("I'm thinking of a number from 1 to 100." +"\n" +"Try to guess it.");
		System.out.println();
		return (int)(Math.random()*100+1);
	}
	private static int getInt(String prompt, Scanner scan) {
		int n = 0;
		boolean isValid = false;
		while (!isValid) {
			if (scan.hasNextInt()) {
			n=scan.nextInt();
			
			} else {
				System.out.println("Enter a valid int");
			}
		
		}
		return n;
	}
	private static int getInt(String prompt, Scanner scan,
							  int min, int max) {
		int n=0;
		boolean isValid = false;
		while (!isValid) {
			n = getInt(prompt, scan);
			if (n < min) {
			 System.out.println("Number below minimum ." +min);
			} else if (n > max) {
				System.out.println("Number above maximum ." +max);
			} else {
				isValid = true;
			}
		}
		return n;
		
			
		}
		
		
}
