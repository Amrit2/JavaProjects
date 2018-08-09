package exercises;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;


public class Movie extends JFrame {
	public Movie(String title) {
		super(title);
		getContentPane().setSize(100,100);
		getContentPane().setLayout(null);
		
		String[] movies = { "Citizen Kane", "Star Wars", "Casablanca"};
		JList moviesList = new JList(movies);
		JScrollPane scrollPane = new JScrollPane(moviesList, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setLocation(10,10);
		scrollPane.setSize(100,100);
		
		getContentPane().add(scrollPane); 									//add the scroll pane instead of movies
		
		
		JTextField newItemField = new JTextField("Dirty Harry");
		newItemField.setLocation(150, 20);
		newItemField.setSize(100, 30);	
		getContentPane().add(newItemField);
	
		String[] options = {"Good", "OK", "Bad", "Really Bad"};
		JComboBox box = new JComboBox(options);
		box.setSize(100,30);
		box.setLocation(150,70);
		getContentPane().add(box);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(290, 230); // manually computed sizes
		setResizable(false);
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new Movie("Movie Ratings");
		frame.setVisible(true);
	}
}
