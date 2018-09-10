import java.util.Scanner;

public class TravelTimeCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		double mi = 0;
		double mpg = 0;
		int ti = 0;
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter miles: ");
			mi = sc.nextDouble();
			System.out.println();
			System.out.print("Enter miles per hour: ");
			mpg = sc.nextDouble();
			System.out.println();
			ti = (int) (mi %mpg);
			System.out.println(ti);
			System.out.print("continue? (y/n): ");
			choice = sc.next();
		}

		sc.close();
		System.out.println("goobye");
	}

}
