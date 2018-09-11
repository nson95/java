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
			mi = getUserMiles(mi);
			mpg = getUserMpg(mpg);
			ti = ((int) (mi %mpg)) / 60;
			System.out.println("Min: " +ti);
			System.out.print("continue? (y/n): ");
			choice = sc.next();
		}

		sc.close();
		System.out.println("goobye");
	}
	public static double getUserMiles(double mi) {
		System.out.println("Enter miles: ");
		return getUserMiles(mi);
	} 
	public static double getUserMpg(double mpg) {
		System.out.println("Enter miles: ");
		return getUserMpg(mpg);
	} 
}
