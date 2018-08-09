package examples;
/**
 * This class demonstrates the use of constructor and encapsulation.
 * @author Kjohnson & Jamal
 *
 */
public class Book 
{
	private String title;
	private String author;
	private int numberOfPages;
	
	/**
	 * Constructor: Sets up this book with the specified title, author, and numberOfPages.
	 * @param title
	 * @param author
	 * @param numberOfPages
	 */
	public Book(String title, String author, int numberOfPages) 
	{
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	
	/**
	 * getter for the title
	 * @return title of book as a string
	 */
	public String getTitle() 
	{
		return title;
	}
	/**
	 * setter for the title
	 * @param title
	 */
	public void setTitle(String title) 
	{
		this.title = title;
	}

	/**
	 * getter for number of pages
	 * @return number of pages as an integer
	 */
	public int getNumberOfPages() 
	{
		return numberOfPages;
	}
	
	/**
	 * setter for number of pages
	 * @param numberOfPages
	 */
	public void setNumberOfPages(int numberOfPages) 
	{
		this.numberOfPages = numberOfPages;
	}
	
	/**
	 * getter for author of book
	 * @return author of book as a string
	 */
	public String getAuthor() 
	{
		return author;
	}
	
	/**
	 * setter for author of book
	 * @param author
	 */
	public void setAuthor(String author) 
	{
		this.author = author;
	}


}
