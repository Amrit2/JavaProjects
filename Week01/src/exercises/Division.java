package exercises;

import java.util.Scanner;

public class Division {

	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the numerator");
		int firstNumber = keyboard.nextInt();

		System.out.println("Please enter the numerator");
		int secondNumber = keyboard.nextInt();
		
		float numOne = (float)firstNumber;
		float numTwo = (float)secondNumber;
		
		float division = numOne/numTwo;
		if (numTwo == 0)
		{
			System.out.println("The input fraction is: " + firstNumber + "/" + 
								secondNumber + "\n" +
								"The quantity is undefined");
		}
		
		else
		{
			System.out.println("The input fraction is: " + firstNumber + "/" + 
							secondNumber + "\n" +
							"The decimal equivalence is: " + division);
		}
		
		keyboard.close();
	}
}
