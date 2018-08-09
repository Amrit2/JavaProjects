package exercises;

import java.util.Scanner;

public class BoxTest {

	public static void main(String[] args) {
		Box box = new Box("2", "1", "5");
		box.setFull(true);
		System.out.println(box);
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Input height,width and depth split by a comma.");
		String userInput = keyboard.nextLine();
		
		String[] measurements = userInput.split(",");
		String height = measurements[0];
		String width = measurements[1];
		String depth = measurements[2];
		
		box.setHeight(height);
		box.setWidth(width);
		box.setDepth(depth);
	
		keyboard.close();
		
//		Box[] boxes = new Box[4];
//		
//		boxes[0] = new Box(100, 120, 200);
//		boxes[1] = new Box(50, 50, 50);
//		boxes[2] = new Box(10, 90, 60);
//		boxes[3] = new Box(250, 150, 30);
//
//		
//		boxes[2].setFull(true);
//		
//		for (int i = 0; i < boxes.length; i++) {
//			System.out.println(boxes[i]);
//		}
//			
	}

}
