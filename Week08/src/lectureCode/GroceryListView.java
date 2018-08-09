package lectureCode;

import javax.swing.*;
/**
 * 
 * @author Mark Lanthier
 * @see <a href=
 *      "http://people.scs.carleton.ca/~lanthier/teaching/COMP1406/Notes/Code/Chapter6/">
 *      GroceryListView</a>
 *
 */
public class GroceryListView extends JPanel {
	private ItemList model; // The model to which this view is attached

	// The user interface components needed by the controller
	private JList aList;
	private JButton addButton;
	private JButton removeButton;
	private JTextField newItemField;

	// public methods to allow access to JComponents
	public JList getList() 
	{
		return aList;
	}

	public JButton getAddButton() 
	{
		return addButton;
	}

	public JButton getRemoveButton() 
	{
		return removeButton;
	}

	public JTextField getNewItemField() 
	{
		return newItemField;
	}

	public GroceryListView(ItemList model) 
	{
		this.model = model; // Store the model for access later

		// Choose to lay out components manually
		setLayout(null);

		// Add the text field
		newItemField = new JTextField();
		newItemField.setLocation(10, 10);
		newItemField.setSize(150, 25);
		add(newItemField);

		// Add the ADD button
		addButton = new JButton("Add");
		addButton.setLocation(175, 10);
		addButton.setSize(100, 25);
		add(addButton);

		// Add the REMOVE button
		removeButton = new JButton("Remove");
		removeButton.setLocation(175, 45);
		removeButton.setSize(100, 25);
		add(removeButton);

		// Add the JList
		aList = new JList();
		JScrollPane scrollPane = new JScrollPane(aList, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setLocation(10, 45);
		scrollPane.setSize(150, 150);
		add(scrollPane);

		setSize(290, 230); // manually computed sizes

		// Call update() to make sure model contents are shown
		update();
	}

	// Update the view to show the model's state
	public void update() {
		// Remember what was selected
		int selectedItem = aList.getSelectedIndex();

		// Now re-populate the list
		String[] exactList = new String[model.getSize()];
		for (int i = 0; i < model.getSize(); i++)
			exactList[i] = model.getItems()[i];
		aList.setListData(exactList);

		// Reselect the selected item
		aList.setSelectedIndex(selectedItem);

		removeButton.setEnabled(aList.getSelectedIndex() >= 0);
		addButton.setEnabled(newItemField.getText().trim().length() > 0);
	}
}