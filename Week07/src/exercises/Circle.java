package exercises;

import java.util.Random;

public class Circle extends Shape {
	int radius;
	
	public Circle() { //set the value in constructor
		
		Random rand = new Random();
		this.radius = rand.nextInt();
	}
	public double computeArea() {
		
		return Math.PI * radius * radius;
	}
}
