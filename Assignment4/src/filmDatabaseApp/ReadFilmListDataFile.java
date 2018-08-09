package filmDatabaseApp;
/**
 * 
 * This class contains two static methods which read and write a database of films.
 * 
 * */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFilmListDataFile 
{

	public static final String filmListDataFilePath = "filmlistdata/";
	public static final String filmListDataFileName = "films.txt";
	//---------------------------------------------------------------------------------------------------------------------
	/**
	 * Writes the text file filListDataFileName of the fruits in supplied FilmList object
	 * 
	 * @param fl a film list to store in the database
	 * */
	public static void saveFilmList(FilmList fl)
	{
		try {

			try (PrintWriter fileWriter = new PrintWriter(new File(filmListDataFilePath+filmListDataFileName)))
			{
				fileWriter.println(fl.getFilmList().length);
				for(Film fruit : fl.getFilmList())
				{
					fileWriter.println(fruit.getName());
					fileWriter.println(fruit.getRating());
				}
				fileWriter.close();
			}		

		} catch (FileNotFoundException e) 
		{			
			e.printStackTrace();
		}

	}
	//---------------------------------------------------------------------------------------------------------------------
	/**
	 * Reads the text file filmListDataFileName of the films in supplied FilmList object
	 * 
	 * @param fl a film list which will be cleared of existing film to store the film read from the database.
	 * */

	public static void loadFilmList(FilmList fl)
	{

		try {

			Scanner fileScan = new Scanner(new File(filmListDataFilePath+filmListDataFileName));


			int nFilms = fileScan.nextInt();
			fileScan.nextLine();
			fl.clear();

			for(int i=1;i<=nFilms;i++)
			{			
				String name = fileScan.nextLine();
				String rating = fileScan.nextLine();

				double filmx = Double.parseDouble(rating);

				Film aFilm = new Film(name,filmx);
				fl.addFilm(aFilm);	
			}

			fileScan.close();
			System.out.println("Loaded "+nFilms+" Films");

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
	}

}
