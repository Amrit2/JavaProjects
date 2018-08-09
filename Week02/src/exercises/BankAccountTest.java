package exercises;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input name: ");
		String name = keyboard.nextLine();
		bankAccount.customerName = name;
		
		System.out.println("Account number: ");
		int accountNumber = keyboard.nextInt();
		bankAccount.code = accountNumber;
		
		keyboard.close();
	}

}
