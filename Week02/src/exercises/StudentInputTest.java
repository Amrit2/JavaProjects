package exercises;
import java.util.Scanner;

public class StudentInputTest {
	public static void main (String[] args) {
		

		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter student's first name: ");
		String firstName = input.nextLine();
		
		System.out.println("Please enter student's last name: ");
		String lastName = input.nextLine();

		System.out.println("Please enter student's ID: ");
		String studentID = input.nextLine();

	
		System.out.println("Calling 3 parameter constructor: ");
		Student studentDetails = new Student(firstName,lastName,studentID);
		System.out.println(studentDetails);
		
		System.out.println("Calling 2 parameter constructor: ");
		studentDetails = new Student(firstName,lastName);
		System.out.println(studentDetails);
		
		System.out.println("Calling 2 parameter constructor: ");
		studentDetails = new Student();
		System.out.println(studentDetails);	
		
		
		input.close();	
		
	}
}
