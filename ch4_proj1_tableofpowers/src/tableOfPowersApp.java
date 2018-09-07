import java.util.Scanner;

public class tableOfPowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.print("Enter an integer: ");
		int x = sc.nextInt();
		
		String table = "";
		String header = "Number\tSquared\tCubed";
		String separator = "======\t=======\t=====";
		table += header;
		table += separator;
		
		for (int i =1; i<=x; i++) {
			int squared = i*i;
			int cubed = i*i*i;
			// System.out.println(i +" " +squared +" " +cubed);
			table+=i +"\t" +squared +"\t" +cubed +"\n";
			System.out.println(table);
			
		}
		System.out.print("continue (y/n)");
		choice = sc.next();
		
		
	}
		
}
}
