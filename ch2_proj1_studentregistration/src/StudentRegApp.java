import java.util.Scanner;

public class StudentRegApp {

	public static void main(String[] args) {
		System.out.println("Student Registration Form");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String firstName = sc.next();
		System.out.println();
		System.out.println("Enter last name: ");
		String lastName = sc.next();
		System.out.print("Enter year of birth: ");
		int birthYear = sc.nextInt();
		
		

	}

}
