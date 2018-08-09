package examples;

/**
 * Source: Java Foundations (Lewis et al.) 
 * This class demonstrates the use of check boxes.
 * @author Kjohnson & Jamal
 */
import javax.swing.JFrame;

public class StyleOptions 
{
	/**
	 * Creates and displays the style options frame.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Style Options");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new StyleOptionsPanel());

		frame.pack();
		frame.setVisible(true);
	}
}
