package examples;

/**
 * Source: Java Foundations (Lewis et al.) 
 * This class demonstrates the use of radio buttons.
 * @author Kjohnson & Jamal
 */
import javax.swing.JFrame;

public class QuoteOptions 
{

	/**
	 * Creates and presents the program frame.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Quote Options");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new QuoteOptionsPanel());

		frame.pack();
		frame.setVisible(true);
	}
}
