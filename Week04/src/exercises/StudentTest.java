package exercises;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student("anon", 18, Grade.A);
		System.out.println(student);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input Name: ");
		String name = keyboard.nextLine();
		student.setName(name);
		
		System.out.println("Input Age: ");
		int age = keyboard.nextInt();
		student.setAge(age);
		
		System.out.println("\n" +student);
		
		keyboard.close();
	}

}
