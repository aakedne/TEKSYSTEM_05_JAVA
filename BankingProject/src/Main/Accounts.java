package Main;

enum AccountTypes{
	CHECKING, SAVING, CREDIT
}



public class Accounts {
	//ref of the enum
	AccountTypes accountTypes;
	
	//class constructor

	public Accounts(AccountTypes accountTypes) {
		super();
		this.accountTypes = accountTypes;
	}
	//method to chose account types
	public void choseAccouts() {
		switch(accountTypes) {
		case CHECKING:
			System.out.println("You chose Checking");
			break;
			
		case SAVING:
			System.out.println("You chose Saving");
			break;
			
		case CREDIT:
			System.out.println("You chose Credit");
			break;
			
	}
	}
}

