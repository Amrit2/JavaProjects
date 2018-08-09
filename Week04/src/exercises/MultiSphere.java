package exercises;

import java.util.Scanner;

public class MultiSphere {

	public static void main(String[] args) {
		Sphere sphere = new Sphere(4);
		System.out.println(sphere);
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Please input the diameter: ");
		int diameter = keyboard.nextInt();
		
		sphere.setDiameter(diameter);
		
		System.out.println("\n" + sphere);
		keyboard.close();
	}

}
