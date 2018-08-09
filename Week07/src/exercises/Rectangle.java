package exercises;

import java.util.Random;

public class Rectangle extends Shape{
	int width;
	int length;
	
	public Rectangle() {
		Random rand = new Random();
		this.width = rand.nextInt();
		this.length = rand.nextInt();
	}

	public double computeArea() {
		
		return width*length;
	}
}
