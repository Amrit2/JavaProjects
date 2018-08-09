package examples;

import javax.swing.*;

import lectureCode.GroceryListView;
import lectureCode.ItemList;
/**
 * 
 * @author Mark Lanthier
 * @see <a href=
 *      "http://people.scs.carleton.ca/~lanthier/teaching/COMP1406/Notes/Code/Chapter6/">
 *      GroceryListViewTestProgram</a>
 *
 */
public class GroceryListViewTestProgram {
	public static void main(String[] args) {

		
		JFrame frame = new JFrame("View Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(290, 230); // manually computed sizes
		frame.setResizable(false);

		frame.getContentPane().add(new GroceryListView(new ItemList()));
		frame.setVisible(true);
	}
}
