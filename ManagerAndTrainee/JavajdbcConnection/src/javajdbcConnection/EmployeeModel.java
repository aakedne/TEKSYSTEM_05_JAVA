package javajdbcConnection;

public class EmployeeModel {
	int employeeNumber;
	String firstName ;
	String lastName;
	String jobTitle;
	String extenstion;
	
	
	public EmployeeModel() {
	
	}

	public EmployeeModel(int employeeNumber, String firstName, String lastName, String jobTitle, String extenstion) {
		super();
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.extenstion = extenstion;
		
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getExtenstion() {
		return extenstion;
	}

	public void setExtenstion(String extenstion) {
		this.extenstion = extenstion;
	}
	
}
