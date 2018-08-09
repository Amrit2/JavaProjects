package exercises;
import java.util.Scanner;

public class ShapeApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean state = true;
		
		while(state) {
			System.out.println("1 Create a circle object \n2 Create a rectangle object \n3 Stop");
			int choice = keyboard.nextInt();
			
			if(choice == 1)
				System.out.println("The area of the circle is: "+ new Circle().computeArea());
			if(choice == 2)		//writing else if doesn;t work?
				System.out.println("The area of the rectangle is: "+ new Rectangle().computeArea());
			if (choice == 3)
				state = false;
		}
		
	}
}
