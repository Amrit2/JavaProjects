package exercises;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Loop extends JFrame{

	public Loop (String title) {
		super(title);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,500);

		List<JButton> buttonList = new ArrayList<JButton>();
		int locationx = 90;
		int locationy = 50;
		for (int i = 0; i <10; i++) {
			JButton button = new JButton("Button: " + i);
			button.setSize(50,50);
			button.setLocation(locationx, locationy);
			buttonList.add(button);
			locationy += 50;
		}
		
//		
//		JButton addButton = new JButton("Button: 1");
//		addButton.setLocation(500,10);
//		addButton.setSize(90,50);;
//		getContentPane().add(addButton);
//
//		JButton addButton1 = new JButton("Button: 2"); 
//		addButton1.setLocation(500,10);
//		addButton1.setSize(50,50);;
//		getContentPane().add(addButton1);
//		
//		JTextField newField = new JTextField("Text box: 1");
//		newField.setLocation(200,10);
//		newField.setSize(100,30);
//		getContentPane().add(newField);

	}

	public static void main (String[] args) {
		Loop frame = new Loop("My Window");
		frame.setVisible(true);
	}
}
