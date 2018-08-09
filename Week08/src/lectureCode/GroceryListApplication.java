package lectureCode;

import javax.swing.*; // Needed for JFrame
import java.awt.event.*; // Need soon for ActionListener
import javax.swing.event.*; // Need soon for ListSelectionListener, DocumentListener
/**
 * 
 * @author Mark Lanthier
 * @see <a href=
 *      "http://people.scs.carleton.ca/~lanthier/teaching/COMP1406/Notes/Code/Chapter6/">
 *      GroceryListApplication</a>
 *
 */
public class GroceryListApplication extends JFrame 
{
	private ItemList model; // The model to which this view is attached
	private GroceryListView view; // The view that shows the state of the model

	public GroceryListApplication(String title) 
	{
		super(title); // Sets the title of the window

		// Create the model and view
		model = new ItemList();
		view = new GroceryListView(model);

		// Add the view
		getContentPane().add(view);

		view.getAddButton().addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				handleAddButtonPress();
			}
		});

		view.getRemoveButton().addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				handleRemoveButtonPress();
			}
		});

		view.getList().addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				handleListSelection();
			}
		});

		view.getNewItemField().getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent theEvent)
			{
				handleTextEntry();
			}

			public void insertUpdate(DocumentEvent theEvent)
			{
				handleTextEntry();
			}

			public void removeUpdate(DocumentEvent theEvent)
			{
				handleTextEntry();
			}
		});

		// Manually computed size
		setSize(290, 230);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// The Add Button event handler
	private void handleAddButtonPress() 
	{
		String text = view.getNewItemField().getText().trim();
		if (text.length() > 0) {
			view.getNewItemField().setText("");
			model.add(text);
			view.update();
		}
	}

	// The Remove Button event handler
	private void handleRemoveButtonPress() 
	{
		int index = view.getList().getSelectedIndex();
		if (index >= 0) {
			model.remove(index);
			view.update();
		}
	}

	// The List click event handler
	private void handleListSelection() 
	{
		view.update();
	}

	// The text field typing event handler
	private void handleTextEntry() 
	{
		view.update();
	}

	// This is where the program begins
	public static void main(String[] args) 
	{
		JFrame frame = new GroceryListApplication("My Grocery List");
		frame.setVisible(true);
	}
}