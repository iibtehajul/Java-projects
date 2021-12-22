
public class App {
	public static void main(String[] args) {

		// Checking account:
		System.out.println("Checking account: ");
		currentAccount account1 = new currentAccount("Nabil", 500);
		System.out.println("Account name: " + account1.name);
		account1.statement();
		System.out.println("Over draft balance: " + account1.min_balance);

		// Deposit
		account1.deposit(800);
		// account1.statement();

		account1.withdraw(1500);
		// account1.statement();
		System.out.println();
		System.out.println();

		// Savings account
		System.out.println();
		System.out.println("Savings account: ");
		
		savingsAccount  account2 = new savingsAccount("Nasif", 1000);
		System.out.println("Account name: " + account2.name);
		account2.statement();
		account2.deposit(250);
		account2.withdraw(1350);
	}

}
