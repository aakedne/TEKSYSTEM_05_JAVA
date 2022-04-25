package ManagerAndTranee;

public class Manager extends Employee{

	public Manager(long Id, String Name, String Address, long Phone, double Salary) {
		super(Id, Name, Address, Phone);
		this.basicSalary = Salary;
	}
	
	public double calculateTransportAllowance() {
		double transportAllowance = (15 * basicSalary/100);
		return transportAllowance;
	}

}