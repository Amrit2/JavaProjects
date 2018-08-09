 package exercises;

import java.util.Scanner;

public class TimeDuration {

	public static void main (String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter the number of hours:");
		int hours = keyboard.nextInt();
		
		System.out.println("Enter the number of minutes:");
		int minutes = keyboard.nextInt();
		
		System.out.println("Enter the number of seconds:");
		int seconds = keyboard.nextInt();
		
		int totalSec = (hours*60*60) + (minutes*60)+ (seconds);
		
		System.out.println("The total number of seconds is "+ totalSec);
		
		keyboard.close();
	}
}
