package filmDatabaseApp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/** 
 *The Controller which mediates between the model and view.
 *Contains all event handling code. 
 */
public class FilmListApp extends JFrame {
	private FilmList model;
	private FilmListPanel view;

	/**
	 * Sets the state of the remove button to enabled if there is a film input in the film text box
	 */
	private void eventHandleListSelection() 
	{
		this.view.getRemoveButton().setEnabled(this.view.getFilmList().getSelectedIndex()!=-1);
	}
	
	
	/**
	 * Sets the state of add button to enabled if there is any film in the film
	 * text box
	 * @param e
	 */
	private void eventHandleKeyReleased(KeyEvent e)
	{
		this.view.getAddButton().setEnabled(!this.view.getFilmNameTextField().getText().isEmpty());
	}

	/**
	 * Sets the state of search button to always being true
	 * @param e
	 */
	private void eventHandleFilterKeyReleased(KeyEvent e)
	{
		this.view.getSearchButton().setEnabled(true);
	}
	
	/**
	 * Handles the event related to the remove button based on the film that's selected in the list
	 */
	private void eventHandleRemoveButton()
	{
		int index = this.view.getFilmList().getSelectedIndex();			// storing the index of the selected film from the film list
		if(index!=-1)													// ensuring the index is a valid number
		{		
			this.model.removeFilmItem(index);							// passing the index to removeFilItem function to remove the selected Film				
		}
		this.view.update();
	}
	
	/**
	 * Handles the event related to opening a window
	 */
	private void eventHandleWindowOpened()
	{
		System.out.println("Window opened!");
		this.view.update();
	}
	
	/**
	 * Handles the event related to the save button
	 */
	private void eventHandleSaveButton()
	{
		//save the file to disk.
		ReadFilmListDataFile.saveFilmList(this.model);
		this.view.update();
	}
	
	/**
	 * Handles the event for clear button
	 */
	private void eventHandleClearButton() {
		ReadFilmListDataFile.loadFilmList(this.model);
		this.view.getFilmFilterName().setText("");
		this.view.update();
	}
	
	/**
	 * Handles the event for Load button
	 */
	private void eventHandleLoadButton()
	{
		//populate the model with fruits loaded from a file.
		ReadFilmListDataFile.loadFilmList(this.model);
		this.view.update();
	}
	
	/**
	 * Handles the event for add button but storing the name and rating of the film before
	 * calling the model to add it to the list of the film items
	 */
	private void eventHandleAddButton()
	{
		String text = this.view.getFilmNameTextField().getText().trim();
		String rating = this.view.getFilmRatingTextField().getText().trim();
		double ratingX = 0;

		try 
		{
			ratingX = Double.parseDouble(rating);			
		}
		catch(NumberFormatException e)
		{

		}

		Film film = new Film(text,ratingX);
		if((!text.isEmpty())&&(!this.model.hasFilmListed(film)))
		{
			this.model.addFilm(film);
			this.view.getFilmNameTextField().setText("");
			this.view.getFilmRatingTextField().setText("");
		}

		this.view.update();
	}

	
	/**
	 * Handles the event related to search button which stores the search item and then calls the 
	 * model function to filter the film list based on the search item
	 */
	private void eventHandleSearchButton() {
		String text = this.view.getFilmFilterName().getText().trim();
		try {
			if(!text.isEmpty())
			{
				this.model.nameFilter(text); 
			}
		}
		catch(NullPointerException e) {
			
		}
		this.view.update();

	}
	
	/**
	 * The constructor initializes the model and loads data from a text file database.
	 * The view is constructed and added to the content pane.
	 * All event handlers for the buttons,lists,fields etc are registered with the appropriate component. 
	 * JFrame is fixed size and has no layout manager.
	 * 
	 * */
	public FilmListApp(String name) {
		super(name);

		//loads the film list
		this.model =  new FilmList();
		ReadFilmListDataFile.loadFilmList(this.model);

		this.view = new FilmListPanel(this.model);

		// add action listener to the load button
		this.view.getLoadButton().addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						eventHandleLoadButton();		
					}
				}				
				);

		// add action listener to the save button
		this.view.getSaveButton().addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						eventHandleSaveButton();		
					}
				}				
				);


		// add action listener to the film name text field
		this.view.getFilmNameTextField().addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyReleased(KeyEvent e) 
			{
				eventHandleKeyReleased(e);
			}
		});

		// add action listener to the filter text input
		this.view.getFilmFilterName().addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyReleased(KeyEvent e) 
			{
				eventHandleFilterKeyReleased(e);
			}

		});

		// add action listener to the remove button
		this.view.getRemoveButton().addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleRemoveButton();		
			}
		});

		// add action listener to the add button
		this.view.getAddButton().addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				eventHandleAddButton();		
			}
		});

		// add action listener to the search button
		this.view.getSearchButton().addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				eventHandleSearchButton();
			}

		});

		// add action listener to the clear button
		this.view.getClearButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				eventHandleClearButton();
			}

		});

		// add list selection action listener 
		this.view.getFilmList().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e)
			{
				eventHandleListSelection();
			}

		});


		// add action listener for window opened
		this.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowOpened(WindowEvent e) 
			{
				eventHandleWindowOpened();
			}
		});

		this.getContentPane().setLayout(null);
		this.getContentPane().add(this.view);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 400); 
		setResizable(false);
		
	}
	//---------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) 
	{
		JFrame frame = new FilmListApp("Movie App");
		frame.setVisible(true);
	}
}