package exercises;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class MyApplication extends JFrame {

	public MyApplication(String title) {
		super(title);
		getContentPane().setLayout(null);
		
		JButton addButton = new JButton("Button1");
		addButton.setLocation(10,10);
		addButton.setSize(90,50);
		addButton.setForeground(Color.RED);
//		UIManager.put("Button.foreground", Color.CYAN);
		getContentPane().add(addButton);
		
		JButton addButton2 = new JButton("Button2");
		addButton2.setLocation(10,90);
		addButton2.setSize(90,50);
//		addButton.setForeground(Color.BLACK);
		UIManager.put("Button.foreground", Color.GREEN);
		getContentPane().add(addButton2);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,300);
	}
	
	public static void main (String[] args) {
		MyApplication frame = new MyApplication("My Window");
		frame.setVisible(true);
	}
}
