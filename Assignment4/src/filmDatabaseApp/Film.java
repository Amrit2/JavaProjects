package filmDatabaseApp;
/**
 * Describes the Film class and has instances of film name and rating
 * @author Amritpal Kaur, 14865526
 *
 */

public class Film {
	private String name;
	private double rating;

	/**
	 * Constructor sets the name of the film
	 * @param name of the film as a string
	 */
	public Film (String name) { 			 
		this.setName(name);
	}
	
	
	/**
	 * Constructor sets the rating and the name
	 * @param name of the film
	 * @param rating of the film as an double
	 */
	public Film(String name,double rating) 		
	{
		this.setName(name);
		this.setRating(rating);
	}
	
	/**
	 * Returns a string version of rating and name
	 */
	public String toString()
	{
		return this.name + " Rating : "+this.rating;
	}
	
	/**
	 * 
	 * @return the name of the film
	 */
	public String getName() 
	{
		return name;
	}
	
	/**
	 * sets the film name
	 * @param name of the film
	 */
	public void setName(String name) 
	{
		this.name = name;
	}
	
	/**
	 * 
	 * @return the rating of the film
	 */
	public double getRating() 
	{
		return rating;
	}
	
	/**
	 * setting the rating
	 * @param rating
	 */
	public void setRating(double rating) 
	{
		this.rating = rating;
	}
	
}
