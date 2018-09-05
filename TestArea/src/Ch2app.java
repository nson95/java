import java.util.Scanner;

public class Ch2app {

	public static void main(String[] args) {
		System.out.println("Why Hello");
		
		System.out.print("Enter an integer:  ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("Enter another integer: ");
		int b = sc.nextInt();
		
		double avg = ((double)a +(double)b)/2;
		
		System.out.println("The average of your numbers is  " +avg);
		
		System.out.println("Goodbye!");
		sc.close();

	}

}
