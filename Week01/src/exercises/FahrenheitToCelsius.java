package exercises;

import java.util.Scanner;

public class FahrenheitToCelsius {
	static final int FAHRENHITE = 33;
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the temperature in Fahrenhite:");
		int tempInFahrenhite = keyboard.nextInt();
		
		int tempInCelsius = tempInFahrenhite / FAHRENHITE;		
		System.out.println("The temperature " + tempInFahrenhite + "F is " + tempInCelsius + "C" );
		
		keyboard.close();
	}

}
