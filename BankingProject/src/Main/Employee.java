package Main;

public class Employee {
	// Fields java classes slide 14
	private String firstName;
	private String lastName;
	private long empId;
	private String jobTitle;
	
	public Employee() {
    }
	public Employee(String firstName, String lastName,long empId, String jobTitle ){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.jobTitle = jobTitle;
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
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empId=" + empId + ", jobTitle="
				+ jobTitle + "]";
	}
	
	
}
