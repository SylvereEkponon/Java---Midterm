import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		
		SavingsAccount savingsAccount = new SavingsAccount(0.5);
		CheckingAccount checkingAccount = new CheckingAccount(100);
		int select = 0;
		do {
		System.out.println("Which of the following accounts you wish to dedal with today\n");
		System.out.println("1.Savings");
		System.out.println("2.Checking");
		System.out.println("3.Quit");
		
		Scanner scanner = new Scanner (System.in);
		
		select = scanner.nextInt();
		
		switch (select) {
		case 1:
			submenu1();
			int select1 = scanner.nextInt();
			switch (select1) {
			case 1:
				System.out.println("Enter an integer amount you wish to deposit:");
				int amount = scanner.nextInt();
				scanner.nextLine();
				savingsAccount.deposit(amount);
				System.out.println("$"+ amount + " has been successfully deposited in your savings!!");
				System.out.println("My Savings balance now = " +"$"+savingsAccount.getBalance());
				
				break;
			case 2:
				System.out.println("Enter an integer amount you wish to transfer:");
				int amount2 = scanner.nextInt();
				scanner.nextLine();
				savingsAccount.transfer(checkingAccount, amount2);
				System.out.println("$"+ amount2 + " has been successfully transferred to your checking Account!!");
				System.out.println("My Savings balance now = " +"$"+savingsAccount.getBalance());
				System.out.println("My Checking balance now = " +"$"+checkingAccount.getBalance());
				break;
				
			case 3:
				System.out.println("Interest has been successfully calculated and deposited in your savings account");
				savingsAccount.addInterest();
				System.out.println("My Savings balance now = " +"$"+savingsAccount.getBalance());
				System.out.println("My Checking balance now = " +"$"+checkingAccount.getBalance());
				break;
			default:
				break;
			}break;
			
		case 2:
			submenu2();
			int select2 = scanner.nextInt();
			switch (select2) {
			case 1:
				System.out.println("Enter an integer amount you wish to deposit:");
				int amount = scanner.nextInt();
				scanner.nextLine();
				checkingAccount.deposit(amount);
				System.out.println("$"+ amount + " has been successfully deposited in your checking!!");
				System.out.println("My Savings balance now = " +"$"+checkingAccount.getBalance());
				
				break;
			case 2:
				System.out.println("Enter an integer amount you wish to withdraw:");
				int amount2 = scanner.nextInt();
				scanner.nextLine();
				checkingAccount.withdraw(amount2);
				System.out.println("$"+ amount2 + " has been successfully withdrawn in your checking!!");
				System.out.println("My Savings balance now = " +"$"+checkingAccount.getBalance());

			default:
				break;
			}
			break;

		case 3:
			System.out.println("My final savings account balance = $" + savingsAccount.getBalance());
			System.out.println("My final checking account balance = $" + checkingAccount.getBalance());
			System.out.println("Bye now!!!");
		default:
			break;
		}
		}while(select!=3);
		

	}

	private static void submenu2() {
		System.out.println("You have chosen Checking!!!");
		System.out.println("What do you want to do with your Checking? \n");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Quit");
	}

	private static void submenu1() {
		System.out.println("You have chosen Savings!!!\n");
		
		System.out.println("What do you want to do with your Savings? \n");
		System.out.println("1.Deposit");
		System.out.println("2.Transfer funds to my Checking");
		System.out.println("3.Add interest to my savings account");
	}

}
