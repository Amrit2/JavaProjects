package exercises;

import java.util.Scanner;

public class ThreeNumberAverage {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");	
		String firstNumber = input.nextLine();
		
		System.out.println("Enter the second number");	
		String secondNumber = input.nextLine();
				
		System.out.println("Enter the third number");	
		String thirdNumber = input.nextLine();
		
		int fNumber = Integer.parseInt(firstNumber);
		int sNumber = Integer.parseInt(secondNumber);
		int tNumber = Integer.parseInt(thirdNumber);
		
		int averageNumber = (fNumber + sNumber + tNumber) / 3;
		
		System.out.println("The average of the numbers is: " + averageNumber);
		input.close();
	}
}
																		