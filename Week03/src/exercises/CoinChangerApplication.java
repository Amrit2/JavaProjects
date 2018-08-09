package exercises;

import java.util.Scanner;

public class CoinChangerApplication {

	public static void main (String[] args)
	{
		boolean answer = false;
		Scanner input = new Scanner (System.in);
		while (!answer){
			System.out.println("Welcome to the Coin Changer Machine. Please input your coins: \nNumber of 10c coins:");
			int tenCents = input.nextInt();

			System.out.println("Number of 20c coins:");
			int twentyCents = input.nextInt();

			System.out.println("Number of 50c coins:");
			int fiftyCents = input.nextInt();

			System.out.println("Number of dollar coins:");
			int oneDollars = input.nextInt();

			System.out.println("Number of two dollar coins:");
			int twoDollars = input.nextInt();

			CoinChanger coinchanger = new CoinChanger(tenCents, twentyCents, fiftyCents, oneDollars, twoDollars);

			System.out.println(coinchanger);

			System.out.println("Would you like to continue? (Y?)");
			input.nextLine();
			answer = input.nextLine().charAt(0) != 'Y';
		
		}
		
		input.close();
	}

}
