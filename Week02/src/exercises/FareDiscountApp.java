package exercises;

import java.util.Scanner;

public class FareDiscountApp {

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
		
		
		int discountPercentage = 0;
		System.out.println(person);
		
		if (person.age > 65) {
			discountPercentage = 100;
		}
		else if (person.age >= 10 && person.age <=20) {
			if (person.student) {
				discountPercentage = 50;
			}
		}
		else if (person.age > 40) {
			if (person.gender == 'F') {
				discountPercentage = 75;
			}
		}
		else if (person.age % 2 == 0) {
			discountPercentage = 25;
		}
		else if (person.age % 2 != 0) {
			discountPercentage = 15;
		}
		
		System.out.println("Person: age: " + person.age + " weight: " + person.weight + " student: " + person.student + " gender: " + person.gender + 
				"\n This person's discount is: " + discountPercentage);
		
		keyboard.close();
	}
}
