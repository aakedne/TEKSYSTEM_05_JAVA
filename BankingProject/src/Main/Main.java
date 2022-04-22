package Main;

public class Main {

	public static void main(String[] args) {
		
//		object and memory slide 14, 10, 8;
		// Object- Oriented Programming static 7 
	//	Employee empOne = new Employee("John","Smith", 12345,"Sales");
	//	System.out.print(empOne.withdraw(200, 50));
	//	empOne.getBankAccount();
//		empOne.getLastName();
//	empOne.setFirstName("Steve");
		
//		Employee empTwo = new Employee("Mark","Smith", 4322,"Sales");
//		
//	Employee empThree = new Employee("Mark","Smith", 4322, null);
//		
//		Manager managerOne = new Manager();
//		managerOne.setFirstName("Bob");
//		managerOne.setLastName("Jones");
//		managerOne.setJobTitle("VIP");
//		managerOne.setEmpId (98765);
//		managerOne.setTimeCards("Mine");
		
		
//		System.out.println(empOne);
//		System.out.println(empTwo);
//		System.out.println(empThree);
//		System.out.println(managerOne.getEmpId()+ managerOne.getFirstName());
		
		
		Box<Integer> intBox =new Box<Integer>();
		intBox.add(12);
		intBox.add(453);
		intBox.add(563);
		intBox.add(435);
		intBox.add(167);
		System.out.println(intBox.get());
		
	}
	
}
	