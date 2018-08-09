package examples;

/**
 * Source: Java Foundations (Lewis et al.) 
 * This class demonstrates the use slider components.
 * @author Kjohnson & Jamal
 */
import java.awt.*;
import javax.swing.*;

public class SlideColor 
{
	/**
	 * Presents a frame with a control panel and a panel that changes color as
	 * the sliders are adjusted.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Slide Colors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new SlideColorPanel());

		frame.pack();
		frame.setVisible(true);
	}
}
