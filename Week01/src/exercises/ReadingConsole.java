package exercises;

import java.util.Scanner;

public class ReadingConsole {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the message?");	
		
		String message = input.nextLine();
		System.out.println("The message is " + message);
		
		input.close();
	}

}
