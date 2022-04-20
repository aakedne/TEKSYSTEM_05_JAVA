
public class Employee {
	String firstName;
	String lastName;
	long empl_id;
	String jobTitle;
	
	
	public Employee(String firstName, String lastName, long emp_id, String jobTitle) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emp_id = emp_id;
		this.jobTitle = jobTitle;
	}
		
	public String getFirstName() {
		return firstName;
	}
		
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empl_id=" + empl_id + ", jobTitle="
				+ jobTitle + "]";
	}
	
	

}
