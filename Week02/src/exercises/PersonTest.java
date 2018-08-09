package exercises;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter person's age ");
		int age = keyboard.nextInt();
		
		System.out.println("Enter person's weight ");
		double weight = keyboard.nextDouble();
		
		System.out.println("Are they a student (true/false) ");
		boolean student = keyboard.nextBoolean();
		
		System.out.println("Enter person's gender ");
		char gender = keyboard.next().charAt(0);
		
		person.age = age;
		person.weight = weight;
		person.student = student;
		person.gender = gender;
		
		System.out.println("Person: age: " + person.age + " weight: " + person.weight + " student: " + person.student + " gender: " + person.gender);
		keyboard.close();
	}
}
