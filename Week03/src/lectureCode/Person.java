package lectureCode;

import java.util.Scanner;

public class Person {
	String firstname;
	String lastname;

	// The constructor for the Person class
	Person(String fn, String ln) {
		this.firstname = fn;
		this.lastname = ln;
	}

	public String toString() {
		return "First name:" + this.firstname + " Last name: " + this.lastname;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter first name:");
		String firstname = keyboard.nextLine();
		System.out.println("Please enter last name:");
		String lastname = keyboard.nextLine();
		Person p1 = new Person(firstname, lastname);
		// do something with p1.
	}
}
