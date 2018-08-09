package exercises;

import java.util.Scanner;

public class ArrayIntroductionTest {

	public static void main(String[] args) {
	
		int[] userInput = new int[5];
		
		Scanner keyboard = new Scanner (System.in);
		
		for (int i = 0; i< userInput.length; i++) {
			System.out.println("Input a number");
			userInput[i] = keyboard.nextInt();
		}
		
		for (int i = 4; i >= 0; i-- ) {
			System.out.println(userInput[i]);
		}
		
		keyboard.close();
	}

}
