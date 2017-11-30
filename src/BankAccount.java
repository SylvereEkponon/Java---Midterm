
public class BankAccount {
	
	//Instance variable
	private double balance;

	
	//Constructors
	public BankAccount() {
		this.balance = 0;
	}
	
	public BankAccount(double balance) {
		
		this.balance = balance;
	}
	
	//public methods
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		
		if (this.balance < amount) {
			throw new IllegalArgumentException("Your balance is $" + this.balance);
		}
		balance -= amount;
	}
	
	public void transfer(BankAccount account, double amount) {
		account.withdraw(amount);
		this.deposit(amount);
	}
	
	public double getBalance () {
		return this.balance;
	}

}
