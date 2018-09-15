import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		System.out.println("Student Registration Form");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstName = sc.next();
		System.out.print("\nEnter last name: ");
		String lastName = sc.next();
		System.out.print("\nEnter year of birth: ");
		int birthYear = sc.nextInt();
		
		System.out.println("Welcome " +firstName +" " +lastName +"!"
				+"\nYour registration is complete."
				+"\nYour temporary password is: " +firstName +"*" +birthYear);

	}

}
