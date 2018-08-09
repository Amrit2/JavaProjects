package lectureCode;

public class BankAccount {
	private String holderName;
	private double balance;
	private int accountNumber;
	static int CURRENT_ACCOUNT_NUMBER = 1000;
	public BankAccount(String holderName, double initialDeposit) {
		this.setHolderName(holderName);

		if (initialDeposit > 0) {
			this.balance = initialDeposit;
		} else {
			this.balance = 0;
		}
		this.accountNumber = BankAccount.CURRENT_ACCOUNT_NUMBER++;

	}

	public BankAccount(String holderName) {
		this(holderName, 0.0);
		this.accountNumber = BankAccount.CURRENT_ACCOUNT_NUMBER++;

	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String name) {
		if ((name != null) && (name != "")) {
			this.holderName = name;
		} else
			this.holderName = "Anonymous";
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public double withdraw(double amount) {
		double returnAmount = 0;
		if (amount <= balance) {
			returnAmount = amount;
			this.balance -= amount;
		} else {
			returnAmount = balance;
			balance = 0;
		}
		return returnAmount;
	}

}
