package examples;

/**
 * Source: Java Foundations (Lewis et al.) 
 * This class demonstrates the use of a combo box.
 * @author Kjohnson & Jamal
 */
import javax.swing.*;

public class JukeBox 
{

	/**
	 * Creates and displays the controls for a juke box.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Java Juke Box");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new JukeBoxControls());

		frame.pack();
		frame.setVisible(true);
	}
}
