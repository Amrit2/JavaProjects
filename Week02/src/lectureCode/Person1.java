package lectureCode;

import java.util.Scanner;

public class Person1 {
	String firstname;
	String lastname;

	// The constructor for the Person class
	Person1(String fn, String ln) {
		this.firstname = fn;
		this.lastname = ln;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter first name:");
		String firstname = keyboard.nextLine();
		System.out.println("Please enter last name:");
		String lastname = keyboard.nextLine();
		Person1 p1 = new Person1(firstname, lastname);
		// do something with p1.
	}
}
