package examples;

import java.awt.event.*; // Need this for ActionEvent and ActionListener
import javax.swing.*; // Need this for JFrame and JButton
/**
 * 
 * @author Mark Lanthier
 * @see <a href=
 *      "http://people.scs.carleton.ca/~lanthier/teaching/COMP1406/Notes/Code/Chapter5/">
 *      SimpleEventTest</a>
 *
 */
public class SimpleEventTest extends JFrame implements ActionListener {
	public SimpleEventTest(String name) {
		super(name);

		getContentPane().setLayout(null);

		JButton aButton = new JButton("Press Me");
		aButton.setLocation(20, 10);
		aButton.setSize(100, 30);
		getContentPane().add(aButton);

		// Plugin button event handler using THIS class as the listener
		// (i.e., tell JAVA to call the actionPerformed() in THIS class)
		aButton.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250, 90);
	}

	// Must write this method now since SimpleEventTest
	// implements the ActionListener interface
	public void actionPerformed(ActionEvent e) {
		System.out.println("I have been pressed");
	}

	public static void main(String[] args) {
		JFrame frame = new SimpleEventTest("Making a Listener");
		frame.setVisible(true);
	}
}