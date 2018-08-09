package examples;

/**
 * Source: Java Foundations (Lewis et al.) 
 * This class demonstrates the use of one listener for multiple buttons.
 * @author Kjohnson & Jamal
 */
import javax.swing.JFrame;

public class LeftRight 
{

	/**
	 * Creates and displays the main program frame.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Left Right");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new LeftRightPanel());

		frame.pack();
		frame.setVisible(true);
	}
}
