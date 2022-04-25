package Main;

public class CustomeExceptionFile extends Exception {
private double amount;
	public CustomeExceptionFile(String message) {
		super(message);
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
}
