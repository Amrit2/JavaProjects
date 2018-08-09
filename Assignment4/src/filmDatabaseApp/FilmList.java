package filmDatabaseApp;
import java.util.ArrayList;
/**
 * This class maintains a list of Film objects with functionality
 * to add and remove films from the list.
 * */

public class FilmList {

	private ArrayList<Film> filmItems;
	
	/**
	 * The constructor instantiates an array list and initializes the filmItems
	 */
	public FilmList()
	{
		this.filmItems = new ArrayList<Film>();
	}
	
	
	/**
	 * Adds the input film to the film list
	 * @param aFilm
	 */
	public void addFilm(Film aFilm)
	{
		this.filmItems.add(aFilm);
	}
	
	
	/**
	 * Removes a selected film from the list
	 * @param index of the film to be removed
	 */
	public void removeFilmItem(int index)
	{
		this.filmItems.remove(index);
	}
	
	
	/**
	 * The function takes the list of filmitems and returns them as a array
	 * @return an array of Films
	 */
	public Film[] getFilmList() {
		Film[] array = new Film[this.filmItems.size()];

		for(int i=0;i<array.length;i++)
		{
			array[i] = this.filmItems.get(i);
		}

		return array;
	}
	
	/**
	 * checks if a certain film exists in the list of films
	 * @param aFilm film to be checked for
	 * @return a boolean as to whether the film existed or not
	 */
	public boolean hasFilmListed(Film aFilm) 
	{
		return this.filmItems.contains(aFilm);
	}
	
	/**
	 * clears the filmList
	 */
	public void clear() 
	{
		this.filmItems.clear();
	}
	
	/**
	 * Filters the list of items to display based on an input search text before clearing and
	 * adding the related search items to the film Items
	 * @param text, search term to be looked for within the list
	 */
	public void nameFilter(String text) {
		Film[] films = new Film[this.filmItems.size()];
		for (int i = 0; i < this.getFilmList().length; i++) {
			if (this.getFilmList()[i].getName().toLowerCase().indexOf(text.toLowerCase()) != -1) {
				films[i] = this.getFilmList()[i];
			}
		}
											//clear the list and add the filtered films to the filList
		clear();
		for (Film f : films) {
			this.filmItems.add(f);  
		}
	}
}
