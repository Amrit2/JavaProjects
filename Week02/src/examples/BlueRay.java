package examples;
/**
 * The BlueRay object contains a Movie object
 * the price of the Blue Ray disc 
 * and the year in which it was released.
 * 
 * */
public class BlueRay {

	Movie content;
	double price;
	int releaseYear;


	public BlueRay(Movie content,double price,int releaseYear)
	{
		this.content = content;
		this.price = price;
		this.releaseYear = releaseYear;
	}
}