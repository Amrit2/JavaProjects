package exercises;

import java.util.Scanner;

public class FuelToGallon {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of miles:");
		int miles = keyboard.nextInt();
		float valueMiles = (float)miles;
		
		System.out.println("Enter the gallons of fuel used:");
		float gallons = keyboard.nextFloat();
		
		double fuelEfficiency = valueMiles/gallons;
		
		System.out.println("Miles Per Gallon: " + fuelEfficiency);
		
		keyboard.close();
	}
}
