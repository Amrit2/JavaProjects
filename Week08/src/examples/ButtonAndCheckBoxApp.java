package examples;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class ButtonAndCheckBoxApp extends JFrame{
	
	public ButtonAndCheckBoxApp(String title){
		super(title);		
		this.setSize(250, 200);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton aButton = new JButton("Button");
		aButton.setLocation(10, 10);
		aButton.setSize(100,40);
		this.getContentPane().add(aButton);
		
		JCheckBox jBox = new JCheckBox();
		jBox.setText("Check Box");
		jBox.setLocation(10,50);
		this.getContentPane().add(jBox);
		jBox.setSize(100,40);
			
	}

	public static void main(String[] args) {
		ButtonAndCheckBoxApp jca = new ButtonAndCheckBoxApp("Button and checkbox");
		jca.setVisible(true);
	}
}
