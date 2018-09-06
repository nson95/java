import java.util.Scanner;

public class RectangleCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
	
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.println("Enter length: ");
		double len = sc.nextDouble();
		System.out.println("Enter width: ");
		double wid = sc.nextDouble();
		
		double area = len * wid;
		double per = 2 * len + 2 * wid;
		System.out.println("Area: " +area);
		System.out.println("Perimeter: " +per);
		System.out.println();
		
	
		System.out.println("continue (y/n)");
		choice = sc.next();
		
		} if (!choice.equalsIgnoreCase("y")) {
			System.out.println("Hope you had a great time, goodbye.");
		
		}
		sc.close();

	}

}
