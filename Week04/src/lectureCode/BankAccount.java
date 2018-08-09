package lectureCode;

public class BankAccount {
	private String name;
	private int accountNumber;
	private double balance;
	private static int CURRENT_ACCOUNT_NUMBER = 1000;

	public BankAccount(String name) {
		this.name = name;
		this.balance = 0.0;
		this.accountNumber = BankAccount.CURRENT_ACCOUNT_NUMBER++;
	}

	static public int getNumberOfAccounts() {
		return CURRENT_ACCOUNT_NUMBER - 1000;
	}
}