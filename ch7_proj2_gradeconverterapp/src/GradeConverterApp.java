
public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			int grade = Console.getInt("Enter numerical grade: ", 0, 100);
			Grade g = new Grade(grade);
			
			
			System.out.println("Letter Grade: " +g.getLetter());
			
			choice = Console.getString("Continue(y/n)? ", "y", "n");
		}
		
		System.out.println("Goodbye.");
	}

}
