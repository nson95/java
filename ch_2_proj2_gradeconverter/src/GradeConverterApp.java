import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter.");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.print("Enter Numerical Grade:  ");
		int numericalGrade = sc.nextInt();
		
		String letterGrade = "";
		
		if (numericalGrade >= 88) {
			letterGrade = "A";
		} else if (numericalGrade >= 80) {
			letterGrade = "B";
		} else if (numericalGrade >= 68) {
			letterGrade = "C";
		} else if (numericalGrade >= 60) {
			letterGrade = "D";
		} else letterGrade = "F";
		
			
			
		
		System.out.println("Letter grade: "+letterGrade);
		
		
		System.out.println("Continue? (y/n)");
		choice = sc.next();
		
	}
		sc.close();
		System.out.println("Goodbye!");

	}

}
