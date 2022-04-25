package ManagerAndTranee;

public class Employee {
	
	public long employeeId;
	public String employeeName;
	public String employeeAddress;
	public long employeePhone;
	public double basicSalary;
	public double specialAllowance = 250.80;
	public double Hra = 1000.50;
	
	
	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary, double specialAllowance, double hra) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
		this.specialAllowance = specialAllowance;
		Hra = hra;
	}
	
	public Employee(long Id, String Name, String Address, long Phone) {
		super();
		Id = employeeId;
		Name = employeeName;
		Address = employeeAddress;
		Phone = employeePhone;
		
	}
	
	public double calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * Hra/100);
		return salary;
		
	}
	
	public double calculateTransportAllowance() {
		double transportAllowance = (basicSalary * 10/100);
		return transportAllowance;
	}
}
