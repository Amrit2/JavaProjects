package exercises;

import java.util.Scanner;

public class ConvertMilesToKMs {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of miles:");
		int input = keyboard.nextInt();
		
		float value = (float)input;
		float kms = (float)1.60935;
		
		float totalKMs = (value * kms);
		
		if (input >= 0) {
			System.out.println("The number of kms is: " + totalKMs);
		}
		else
			System.out.println("Please enter a value greater than 0!");
		
		keyboard.close();
	}

}
