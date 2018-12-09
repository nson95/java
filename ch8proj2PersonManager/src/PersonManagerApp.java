import java.util.ArrayList;

public class PersonManagerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Person Manager App ");
		String choice = "y";
		ArrayList<Person> people = new ArrayList<>();
		while (choice.equalsIgnoreCase("y")) {
			String nc = Console.getString("Create customer or employee? (c/e): ", "c", "e");
			if (nc.equalsIgnoreCase("c")) {
				String fn = Console.getString("Please enter your first name: ");
				String ln = Console.getString("Please enter your last name: ");
				Customer c = new Customer(fn, ln, "82");
				people.add(c);
				System.out.println("Customer successfully registered: " +c.toString());
			} 
			if (nc.equalsIgnoreCase("e")) {
				String fn = Console.getString("Please enter your first name: ");
				String ln = Console.getString("Please enter your last name: ");
				String ssn = Console.getString("Please enter your social security number: ");
				Employee e = new Employee(fn, ln, ssn);
				people.add(e);
				System.out.println("Employee successfully registered: " +e.toString());
			}
			choice = Console.getString("Continue?", "y", "n");
			if (choice.equalsIgnoreCase("n")) {
				System.out.println(people);
			}
			
		}
		System.out.println("Goodbye!");
	}

}
