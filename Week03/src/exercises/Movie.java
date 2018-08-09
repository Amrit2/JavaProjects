package exercises;

public class Movie {
	private String title;
	private Rating rating;
	
	public Movie() {
		this("UNKNOWN", Rating.GENERAL);
	}
	
	public Movie(String title, Rating rating) {
		this.setTitle(title);
		this.setRating(rating);
	}
	
	public void setTitle(String title) {
		this.title = title;	
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public Rating getRating()
	{
		return this.rating;
	}
	public void setRating(Rating rating)
	{
		this.rating = rating;
	}
	
	@Override
	public String toString()
	{
		return this.getTitle()+ " rating: "+this.getRating();
	}
}
