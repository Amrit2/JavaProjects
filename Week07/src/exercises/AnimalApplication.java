package exercises;

import java.util.Scanner;

public class AnimalApplication {
	
	
	public static void main(String[] args) {
		final int size = 4;
		Scanner keyboard = new Scanner(System.in);

		Animal[] animal = new Animal[size];

		for (int i = 0; i< animal.length; i++) {
				System.out.println("Type 1 to create a Dog object or 2 to create a Cat object");
				int choice = keyboard.nextInt();
				if (choice == 1) {
					animal[i] = new Dog();;
				}

				else {
					animal[i] = new Cat();
				}
		}
		
		int count = 0;
		do{
			System.out.println("\nSelect an animal to feed by entering a number within the range: 0 to 4");
			int number = 0;
			for (Animal a : animal) {
				System.out.println(number+ " " + a);
				number++;
			}
			
			int choice = keyboard.nextInt();
			if (choice >=0 && choice < 4) {
				animal[choice].feed();
			}
//			if (choice == 0) {
//				Cat cat = new Cat();
//				cat.feed();
//				animal[0] = cat;
//			}
//			else if (choice == 1) {
//				Dog dog = new Dog();
//				dog.feed();
//				animal[0] = dog;
//			}
//			else if (choice == 2) {
//				Cat cat = new Cat();
//				cat.feed();
//				animal[0] = cat;
//			}
//			else {
//				Dog dog = new Dog();
//				dog.feed();
//				animal[0] = dog;		
//			}
			count++;
		} while (count < 4);
			
		System.out.println("Input out of range, quitting.");
		
		keyboard.close();

	}
}
