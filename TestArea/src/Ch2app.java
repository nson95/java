import java.util.Scanner;

public class Ch2app {

	public static void main(String[] args) {
		System.out.println("Why Hello");
		
		System.out.print("Enter an integer:  ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("Enter another integer: ");
		int b = sc.nextInt();
		
		double avg = ((double)a +(double)b)
				/2;
		
		
		System.out.println("The average of your numbers is  " +avg);
		
		
		if (avg > 10) {
			System.out.println("Woohoo! Over ten, right?");
		}
		else {
			System.out.println("Oh.. I'm so sorry. Under ten, right?");
		}
		
		
		System.out.println("Enter 'yes' or 'no'");
		String str = sc.next();
		if (str.equals("yes")) {
			System.out.println("Confirmed!");
			System.out.println("Goodbye!");
		}
		if (!str.equals("yes")) {
			System.out.println("YOU LIE!!");
			System.out.println("Now you're stuck here..");
		}
		
		sc.close();

	}

}
