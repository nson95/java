import java.util.Scanner;

public class TravelTimeCalcV2App {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter miles: ");
			double miles = sc.nextDouble();
			System.out.print("Enter miles per hour: ");
			double mph = sc.nextDouble();
			int hr = (int)miles/ (int)mph;
			int min = ((int)miles%(int)mph);
			System.out.print("Hours: " +hr +"\n" +"Minutes: " +min);
			System.out.println();
			System.out.print("continue? (y/n) ");
			choice = sc.next();
		}
		System.out.println("goodbye, possibly forever.");
		sc.close();

	}

}
