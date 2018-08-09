package examples;


/**
 * Source: Java Foundations (Lewis et al.) 
 * This class represents a bank account with basic services such as deposit and withdraw.
 * @author Kjohnson & Jamal
 */
import java.text.NumberFormat;

public class Account 
{
	

	private final double RATE = 0.035; // interest rate of 3.5%

	private String name;
	private long acctNumber;
	private double balance;
	/**
	 * Constructor: Sets up this account with the specified owner, account number, and initial balance.
	 * @param name : name of owner
	 * @param accNumber : Account number
	 * @param balance: initial Balance
	 */
	public Account(String name, long acctNumber, double balance) 
	{
		this.name = name;
		this.acctNumber = acctNumber;
		this.balance = balance;
	}
	/**
	 * This method Deposits the specified amount into this account. 
	 * The balance is not modified if the deposit amount is invalid.
	 * @param amount : specified amount to deposit
	 * @return new balance of account
	 */
	public double deposit(double amount) 
	{
		if (amount > 0)
		{
			balance = balance + amount;
		}
		return balance;
	}

	/**
	 * This method Withdraws the specified amount and fee from this account. 
	 * The balance is not modified if the withdraw amount is invalid or the balance is insufficient.
	 * @param amount : specified amount to withdraw
	 * @param fee : specified fee to withdraw
	 * @return the new balance of account
	 */
	public double withdraw(double amount, double fee) 
	{
		if (amount + fee > 0 && amount + fee < balance)
		{
			balance = balance - amount - fee;
		}
		return balance;
	}

	/**
	 * This method adds interest to this account.
	 * @return the new balance of account
	 */
	public double addInterest() 
	{
		balance += (balance * RATE);
		return balance;
	}

	/**
	 * getter for balance
	 * @return the current balance of this account
	 */
	public double getBalance() 
	{
		return balance;
	}

	/**
	 * String representation of Account
	 * @return a one-line description of this account as a string
	 */
	public String toString() 
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
	}
}
