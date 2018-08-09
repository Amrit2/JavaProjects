package exercises;

import java.util.Scanner;

public class Kennel {

	public static void main(String[] args) {
		Dog dog = new Dog("Coco", 2);
		System.out.println(dog);

		Scanner keyboard = new Scanner (System.in);
		System.out.println("\nWhat's the dog's name?");
		String name = keyboard.nextLine();
		dog.setName(name);
		
		System.out.println("\nWhat's the dog's age?");
		int age = keyboard.nextInt();
		dog.setAge(age);
		
		System.out.println(dog);
		
		keyboard.close();
	}

}
