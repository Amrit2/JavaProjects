package examples;
/**
 * Source: Java Foundations (Lewis et al.) 
 * This class demonstrates a graphical user interface and an event listener.
 * @author Kjohnson & Jamal
 */

import javax.swing.JFrame;

public class PushCounter
{

   /**
    * Creates and displays the main program frame.
    * @param args
    */
	public static void main(String[] args)
   {
      JFrame frame = new JFrame("Push Counter");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      PushCounterPanel panel = new PushCounterPanel();
      frame.getContentPane().add(panel);

      frame.pack();
      frame.setVisible(true);
   }
}