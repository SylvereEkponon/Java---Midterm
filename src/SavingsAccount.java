
public class SavingsAccount extends BankAccount {

	//instance variable
	private double interestRate;

	public SavingsAccount(double interestRate) {
		
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		
		double interest = super.getBalance() * (interestRate/100);
		super.deposit(interest);
		
	}
	
}
