package exercises;

import java.util.Scanner;

public class EquivalentTime {
	
	static final int NUMBER_OF_SEC_IN_MIN = 60;
	static final int NUMBER_OF_SEC_IN_HOUR = 3600;

	public static void main (String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter the number of seconds:");
		int totalSeconds = keyboard.nextInt();
		
		
		int hours = totalSeconds/ NUMBER_OF_SEC_IN_HOUR ;
		int totalMinutes = totalSeconds% NUMBER_OF_SEC_IN_HOUR;
		
		int minutes = totalMinutes / NUMBER_OF_SEC_IN_MIN;
		int seconds = totalMinutes % NUMBER_OF_SEC_IN_MIN;
		
		System.out.println(seconds + " seconds is equivalent to" + "\n" +
							hours + " hours" + "\n" + minutes + " minutes" + "\n" + seconds + " seconds");

		keyboard.close();
	}
}
