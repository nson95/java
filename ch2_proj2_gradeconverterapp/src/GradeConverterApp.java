import java.util.Scanner;

public class GradeConverterApp {
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int numberGrade =0;
		String choice = "y";
		String letterGrade = null;
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter numerical grade: ");
			numberGrade = sc.nextInt();
			if (numberGrade>=88) {
				letterGrade = "A";
				} else if (numberGrade>=80) {
					letterGrade = "B";
				}else if (numberGrade>=70) {
					letterGrade = "C";
				} else if (numberGrade>=60) {
					letterGrade="D";
				} else letterGrade="F";
			
			System.out.println("Letter Grade: " +letterGrade);
			System.out.print("Continue? (y/n) ");
			choice = sc.next();
		}
		System.out.println("GoodBye!");
	}

}
