package examples;

import javax.swing.*;

import lectureCode.GroceryListView;
import lectureCode.ItemList;
/**
 * 
 * @author Mark Lanthier
 * @see <a href=
 *      "http://people.scs.carleton.ca/~lanthier/teaching/COMP1406/Notes/Code/Chapter6/">
 *      GroceryListViewTestProgram2</a>
 *
 */
public class GroceryListViewTestProgram2 {
	public static void main(String[] args) {
		ItemList groceryList = new ItemList();
		groceryList.add("Apples");
		groceryList.add("Oranges");
		groceryList.add("Bananas");

		GroceryListView aView = new GroceryListView(groceryList);

		JFrame frame = new JFrame("View Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(290, 230); // manually computed sizes
		frame.setResizable(false);
		frame.getContentPane().add(aView);
		frame.setVisible(true);
	}
}