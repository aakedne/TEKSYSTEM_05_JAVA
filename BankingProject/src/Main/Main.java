package Main;

public class Main {

	public static void main(String[] args) {
		
		Employee empOne = new Employee("John", "Smith",435, "Sales");
		Employee empTwo = new Employee("David", "smith", 564, "Sales");
		Employee Manager = new Manager("Kevin", "Key", 437, "Manager", "timecard");
	
		System.out.println(empOne);
		System.out.println(empTwo);

	}
	
}
	