import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Dice Roller");
		System.out.println();
		int a=0; 
		int b=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Roll the dice? (y/n): ");
		String choice = sc.next();
		while (choice.equalsIgnoreCase("y")) {
			a = (int) (Math.random() * 6 + 1);
			b = (int) (Math.random() * 6 + 1);
			if (a == 1 && b == 1) {
				System.out.print("Die 1: " +a +"\n");
				System.out.print("Die 2: " +b +"\n");
				System.out.println("Snake eyes!");
			} else if (a==6 && b==6) {
				System.out.print("Die 1: " +a +"\n");
				System.out.print("Die 2: " +b +"\n");
				System.out.println("Boxcars!");
				
			} else {
				System.out.print("Die 1: " +a +"\n");
				System.out.print("Die 2: " +b +"\n");
				}
			System.out.print("Roll Again? (y/n): " +"\n");
			choice = sc.next();
		} sc.close();
		
	    
	}
	
		
		
}


