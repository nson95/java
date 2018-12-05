

public class PersonManagerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Person Manager App ");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String nc = Console.getString("Create customer or employee? (c/e): ", "c", "e");
			if (nc.equalsIgnoreCase("c")) {
				String fn = Console.getString("Please enter your first name: ");
				String ln = Console.getString("Please enter your last name: ");
				Customer c = new Customer(fn, ln, "82");
				
			} 
			if (nc.equalsIgnoreCase("e")) {
				String fn = Console.getString("Please enter your first name: ");
				String ln = Console.getString("Please enter your last name: ");
				String ssn = Console.getString("Please enter your social security number: ");
				Employee e = new Employee(fn, ln, ssn);
				System.out.println("Employee successfully registered: " +fn +" " +ln);
			}
			choice = Console.getString("Continue?", "y", "n");
		}
		System.out.println("Goodbye!");
	}

}
