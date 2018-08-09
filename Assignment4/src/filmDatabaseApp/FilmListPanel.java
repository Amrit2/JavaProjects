package filmDatabaseApp;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
/**
 * The view of the app. Contains all JComponents to display the FilmList model.
 * each button/field etc has a get method for access outside of the FilmListPanel class.
 * 
 * */
public class FilmListPanel extends JPanel {

	private FilmList model;

	private JList<Film> filmList;					
	private JTextField filmNameInput;
	private JTextField filmRatingInput;
	private JTextField filmFilterName;


	private JButton addButton;
	private JButton removeButton;
	private JButton saveButton;
	private JButton loadButton;
	private JButton searchButton;
	private JButton clearButton;
	
	// get functions for all the attributes
	public JButton getSaveButton()
	{
		return this.saveButton;
	}
	
	public JButton getLoadButton()
	{
		return this.loadButton;
	}
	
	public JList<Film> getFilmList()
	{
		return this.filmList;
	}
	
	public JTextField getFilmRatingTextField()
	{
		return this.filmRatingInput;
	}
	
	public JTextField getFilmNameTextField()
	{
		return this.filmNameInput;
	}
	
	public JButton getRemoveButton()
	{
		return this.removeButton;
	}
	
	public JButton getAddButton()
	{
		return this.addButton;
	}
	
	public JTextField getFilmFilterName() {
		return filmFilterName;
	}

	public JButton getSearchButton() {
		return searchButton;
	}

	public JButton getClearButton() {
		return clearButton;
	}
	
	
	/**
	 * The constructor initializes the view of the app
	 * @param model
	 */
	public FilmListPanel(FilmList model)
	{
		this.model = model;																	//set the model.

		setLayout(null);						
		this.filmList = new JList(this.model.getFilmList());  								// creating a film list

		this.filmList.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane scrollPane = new JScrollPane(filmList, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setLocation(50, 112);
		scrollPane.setSize(400, 200);

		this.add(scrollPane);

		JLabel name = new JLabel("Enter Film Name:");
		name.setLocation(240, 6);
		name.setSize(100, 30);
		name.setForeground(Color.yellow);
		this.add(name);
		
		//add the fruit name input text field...
		this.filmNameInput = new JTextField("");
		this.filmNameInput.setLocation(240, 30);
		this.filmNameInput.setSize(100, 25);
		this.add(filmNameInput);

		JLabel rating = new JLabel("Enter Film Rating:");
		rating.setLocation(350, 6);
		rating.setSize(100, 30);
		rating.setForeground(Color.YELLOW);
		this.add(rating);
		
		this.filmRatingInput = new JTextField("");
		this.filmRatingInput.setLocation(350, 30);
		this.filmRatingInput.setSize(100, 25);
		this.add(filmRatingInput);

		// Add the ADD button
		this.addButton = new JButton("Add Film");
		addButton.setLocation(300, 65);
		addButton.setSize(100, 25);
		this.add(addButton);

		
		// Add the REMOVE button
		removeButton = new JButton("Remove");
		removeButton.setLocation(90, 320);
		removeButton.setSize(100, 25);
		this.add(removeButton);

		
		// Add the Save button
		this.saveButton = new JButton("Save");
		saveButton.setLocation(210, 320);
		saveButton.setSize(100, 25);
		this.add(saveButton);

		
		// Add the Load button
		this.loadButton = new JButton("Load Films");
		loadButton.setLocation(330, 320);
		loadButton.setSize(100, 25);
		this.add(loadButton);

		// Label for filter
		JLabel filter = new JLabel("Filter via name:");
		filter.setLocation(40, 6);
		filter.setSize(100, 30);
		filter.setForeground(Color.YELLOW);
		this.add(filter);
		
		//filter via name search 
		this.filmFilterName = new JTextField("");
		this.filmFilterName.setLocation(40, 30);
		this.filmFilterName.setSize(150, 25);
		this.add(filmFilterName);

		
		// Add the Search button
		this.searchButton = new JButton("Search");
		searchButton.setLocation(40, 65);
		searchButton.setSize(80, 25);
		this.add(searchButton);
		
		// Add the clear button
		this.clearButton = new JButton("Clear");
		clearButton.setLocation(130, 65);
		clearButton.setSize(70, 25);
		this.add(clearButton);

		setSize(500, 400); // manually computed sizes
		setBackground(Color.darkGray);
		this.update();
	}
	//---------------------------------------------------------------------------------------------------------------------
	
	/***
	 * The update method is called by most event handler methods in the
	 * FilmListApp.
	 */ 
	
	public void update()
	{
		this.filmList.setListData(this.model.getFilmList());		
		this.addButton.setEnabled(!this.filmNameInput.getText().isEmpty());
		this.removeButton.setEnabled(this.filmList.getSelectedIndex()!=-1);
		this.searchButton.setEnabled(true);
	}
	//---------------------------------------------------------------------------------------------------------------------
}