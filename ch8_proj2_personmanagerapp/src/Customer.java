
public class Customer extends Person {
	private int customerNumber;

	public Customer(String firstName, String lastName, int customerNumber) {
		super(firstName, lastName);
		this.customerNumber = customerNumber;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	
	
}
