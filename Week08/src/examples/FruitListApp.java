package examples;

import javax.swing.*;
/**
 * 
 * @author Mark Lanthier
 * @see <a href=
 *      "http://people.scs.carleton.ca/~lanthier/teaching/COMP1406/Notes/Code/Chapter5/">
 *      FruitListApp</a>
 *
 */
public class FruitListApp extends JFrame {
	public FruitListApp(String name) {
		super(name);

		// Choose to lay out components manually
		getContentPane().setLayout(null);

		// Add the text field
		JTextField newItemField = new JTextField("Grapes");
		newItemField.setLocation(10, 10);
		newItemField.setSize(150, 25);	
		getContentPane().add(newItemField);

		// Add the ADD button
		JButton addButton = new JButton("Add");
		addButton.setLocation(175, 10);
		addButton.setSize(100, 25);
		getContentPane().add(addButton);

		// Add the REMOVE button
		JButton removeButton = new JButton("Remove");
		removeButton.setLocation(175, 45);
		removeButton.setSize(100, 25);
		getContentPane().add(removeButton);

		// Add the JList
		String[] fruits = { "Apples", "Oranges", "Bananas", "Cherries", "Lemons", "Pears", "Strawberries", "Peaches",
				"Pomegranates", "Nectarines", "Apricots" };
		JList fruitList = new JList(fruits);
		JScrollPane scrollPane = new JScrollPane(fruitList, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setLocation(10, 45);
		scrollPane.setSize(150, 150);
		getContentPane().add(scrollPane);

		// Set program to stop when window closed
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(290, 230); // manually computed sizes
		setResizable(false);
	}

	public static void main(String[] args) {
		JFrame frame = new FruitListApp("My Fruit List");
		frame.setVisible(true);
	}
}