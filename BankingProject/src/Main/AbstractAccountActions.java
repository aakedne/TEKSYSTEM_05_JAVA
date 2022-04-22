package Main;

public class AbstractAccountActions {
String bankAccount;
	
	// default constructor
	public AbstractAccountActions() {
		
	}
	
	public AbstractAccountActions(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	
	// no method body
	abstract float withdraw(int amount, int withdrawAmount);
	abstract float deposit(int amount, int depositAmount);
	
	public String getBankAccount() {
		return bankAccount;
	}
@Override
	float withdraw(int amount, int withdrawAmount) {
		totalAmount = amount - withdrawAmount;
				return totalAmount;
	}

	@Override
	float deposit(int amount, int depositAmount) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
	
	
	


