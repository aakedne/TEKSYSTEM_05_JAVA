package Main;

public class Manager extends Employee {
// inheritance 27
// fields
	private String timeCards;
	
public Manager() {
	
}
	public Manager(String firstName, String lastName, long empId, String jobTitle, String timeCards) {
		
		super(firstName,lastName,empId,jobTitle);
		this.timeCards = timeCards;
	}
	
	public String toString() {
	return "manager [timeCards = " + timeCards + "]";
}
}
