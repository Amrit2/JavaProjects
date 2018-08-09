package examples;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import   javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * GUI example updating a JLabel object
 * when a button is pushed
 * 
 * @author ken johnson
 * 
 * 
 * */

public class PressButtonExample extends JFrame implements ActionListener{

	private int count;	
	private JLabel buttonCount;
	
	
	public PressButtonExample(String title) {
		super(title);                             // Set title of window
		count=0;
		setDefaultCloseOperation(EXIT_ON_CLOSE);  // allow window to close
		setSize(300, 300);                        // Set size of window
		setLayout(null);//layout components manually
		
		JButton button = new JButton("Press Me");
		button.setSize(100,100);
		button.setLocation(100,100);
		button.addActionListener(this);
		this.getContentPane().add(button);
		
		buttonCount = new JLabel("Button pressed 0 times");
		buttonCount.setSize(180,80);
		buttonCount.setLocation(80,10);		
		this.getContentPane().add(buttonCount);
	}

	public static void main(String[] args) {
		PressButtonExample frame;

		frame = new PressButtonExample("My Window");		// Create window
		frame.setVisible(true);                  	// Show window
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		buttonCount.setText("Button pressed "+count+" times");
		
	}
}
