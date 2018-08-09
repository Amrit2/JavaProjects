package exercises;

import java.util.Scanner;

public class FlightTest {

	public static void main(String[] args) {
		Flight flight = new Flight ("Emirates", 405 , "Auckland" , "Mars");
		Scanner keyboard = new Scanner(System.in);
		System.out.println(flight);
		
		System.out.println("\nWhat's the name of the Airline");
		String name = keyboard.nextLine();
		flight.setName(name);
		
		System.out.println("\nWhat's the number of the Airline");
		int number = keyboard.nextInt();
		flight.setNumber(number);
		
		System.out.println("\nWhat's the origin of the Airline");
		String origin = keyboard.nextLine();
		keyboard.nextLine();
		flight.setFlightOrigin(origin);
		
		System.out.println("\nWhat's the destination of the Airline");
		String destination = keyboard.nextLine();
		flight.setDestinations(destination);
		
		System.out.println(flight);
		
		keyboard.close();
	}

}
