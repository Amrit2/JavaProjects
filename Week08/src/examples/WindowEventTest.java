package examples;

import java.awt.event.*; // Need this for ActionEvent and ActionListener
import javax.swing.*; // Need this for JFrame and JButton
/**
 * 
 * @author Mark Lanthier
 * @see <a href=
 *      "http://people.scs.carleton.ca/~lanthier/teaching/COMP1406/Notes/Code/Chapter5/">
 *      WindowEventTest</a>
 *
 */
public class WindowEventTest extends JFrame implements WindowListener {
	public WindowEventTest(String name) {
		// ...
		// Plugin window event handler
		this.addWindowListener(this);
		// ...
	}

	// Unfortunately, we now have to write 7 methods as follows,
	// (even though we really only want to write one):

	public void windowOpened(WindowEvent e) {
		System.out.println("Window has been opened");
	}

	public void windowClosed(WindowEvent e) {
		/* leave blank */ }

	public void windowClosing(WindowEvent e) {
		/* leave blank */ }

	public void windowActivated(WindowEvent e) {
		/* leave blank */ }

	public void windowDeactivated(WindowEvent e) {
		/* leave blank */ }

	public void windowIconified(WindowEvent e) {
		/* leave blank */ }

	public void windowDeiconified(WindowEvent e) {
		/* leave blank */ }

	public static void main(String[] args) {
		JFrame frame = new WindowEventTest("Testing the Window Opening Event");
		frame.setVisible(true);
	}
}