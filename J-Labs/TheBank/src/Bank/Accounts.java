package Bank;

public class Accounts extends User {
	float balance = deposit;
	float prevTransaction;
	String userName;
	String userId;
	
	void deposit(float amount) {
		
		if(amount >= 0) {
			balance = balance + amount;
			prevTransaction = amount;
		}
	}
	
	void withdraw(float amount) {
		if(amount != 0) {
			balance = balance - amount;
			prevTransaction = amount;
			
		}
	}
	
	void getPrevTransaction()  {
		if(prevTransaction > 0 ) {
			System.out.println("A deposit was made of: "+ prevTransaction);
		}
		else if(prevTransaction < 0 ) {
			System.out.println("A withdraw was made of: "+ Math.abs(prevTransaction));
		}
		else {
		System.out.println("No recent Transactions. Balance is still "+ balance);
		}
	}
		
}
