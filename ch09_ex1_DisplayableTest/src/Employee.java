public class Employee implements Displayable, DepartmentConstants {

    private int department;
    private String firstName;
    private String lastName;

    public Employee(int department, String lastName, String firstName) {
        this.department = department;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    Employee employee = new Employee(int , String lastName, String firstName);

	@Override
	public String getDisplayText() {
		return ("Employee: " +firstName +" " +lastName
				+"/nDepartment: " +department);
	}
}