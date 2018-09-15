import java.util.Scanner;

public class Project3RoundTwoApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter length: ");
			double len = sc.nextDouble();
			System.out.print("Enter width: ");
			double wid =  sc.nextDouble();
			double area = (len*wid);
			double per = (len*2)+(wid*2);
			System.out.print("Area: " +area +"\nPerimeter: " +per +"\n");
			System.out.print("Continue? (y/n) ");
			choice = sc.next();
		}
		System.out.println("Alright I'm outta here");
	}

}
