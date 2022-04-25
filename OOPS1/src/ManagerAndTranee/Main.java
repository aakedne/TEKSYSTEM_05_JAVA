package ManagerAndTranee;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		double salaryAmountManager = manager.calculateSalary();
		System.out.println(salaryAmountManager);
		Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		double salaryAmountTrainee = trainee.calculateSalary();
		System.out.println(salaryAmountTrainee);
		double allowanceForManager = manager.calculateTransportAllowance();
		System.out.println(allowanceForManager);
		double allowanceForTrainee = trainee.calculateTransportAllowance();
		System.out.println(allowanceForTrainee);

	}

}
