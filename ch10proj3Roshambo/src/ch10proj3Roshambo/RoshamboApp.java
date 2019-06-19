package ch10proj3Roshambo;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Game of Roshambo");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
			while (choice.equalsIgnoreCase("y")) {
				System.out.println("Enter your name: ");
				Player1 np = new Player1();
				np.setName(sc.next());
				Player player2 = null;
				
				System.out.println("Would you like to play Bart or Lisa? (b/l) ");
				String p=sc.next();
				if (p =="b")
					player2 = new Bart();
				else if (p =="y")
					player2 = new Lisa();
				
				System.out.println("Rock, paper, or scissors? (R/P/S): ");
				String d = sc.next();
				if (d=="r")
					np.setRsb(Roshambo.rock);
				else if (d=="p")
					np.setRsb(Roshambo.paper);
				else if (d=="s")
					np.setRsb(Roshambo.scissors);
				
				Roshambo rmb = player2.generateRoshambo();
				player2.setRsb(rmb);
				
				if (np.getRsb()==player2.getRsb())
					System.out.println("Draw!");
				else if (np.getRsb()==Roshambo.rock && player2.getRsb()==Roshambo.scissors)
					System.out.println(np.getName() + " wins!");
				else if (np.getRsb()==Roshambo.paper && player2.getRsb()==Roshambo.rock)
					System.out.println(np.getName() + " wins!");
				else if (np.getRsb()==Roshambo.scissors && player2.getRsb()==Roshambo.paper)
					System.out.println(np.getName() + " wins!");
				else 
					System.out.println(player2.getName() + " wins!");
				System.out.println("Continue? (y/n)");
				choice=sc.next();
			}
			System.out.println("Goodbye!");
		}

}
