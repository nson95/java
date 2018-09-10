import java.util.Scanner;

public class StuffyDispenserApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffy Dispenser");
		
		System.out.println("Create a new Stuffy...");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter name: ");
		String name = sc.next();
		
		System.out.print("Enter type (of animal): ");
		String type = sc.next();
		
		System.out.print("Enter color: ");
		String color = sc.next();
		
		Stuffy myStuffy = new Stuffy("Tyler", "bear", "red");
		
		
		System.out.println("New stuffy: " +myStuffy);
		System.out.println("goobye");
		sc.close();

	}
	
}
