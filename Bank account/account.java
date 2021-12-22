
public class account {
	
	public String name;
	public double balance;
	public static double min_balance;
	
	public account(String name, double balance, double min_balance) {

		
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount deposited: " + amount);
		System.out.println("Account balance: " + balance);
	}
	
	public void withdraw(double amount) {
		
		System.out.println("Requested withdraw amount: " + amount);
		
		if (amount <= (balance + min_balance)) {
			balance = balance - amount;
			System.out.println("Account balance: " + balance);
		}else {
			System.out.println("Sorry. Not enough funds!");
		}
	}
	
	public void statement() {
		System.out.println("Account balance: $" + balance);
	}
	
}
