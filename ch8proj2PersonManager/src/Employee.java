

public class Employee extends Person {
	private String ssn;
	
	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Employee: " +firstName +" " +lastName +"ssn: " + ssn + "]";
	}
	
}
