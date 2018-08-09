package exercises;
import java.util.Scanner;

public class BookInputTest {
	
	public static void main(String[] args)
	{
		Book book = new Book();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the title of the book");
		String title = keyboard.nextLine();
		book.title = title;
		
		System.out.println("Please enter the author name");
		String author = keyboard.nextLine();
		book.author = author;
		
		System.out.println("Please enter the number of pages");
		int numberOfPages = keyboard.nextInt();
		if (numberOfPages > 0) {
			book.numberOfPages = numberOfPages;
		}
		
		System.out.println("The book title is: " + book.title + "\n" + 
				"The book author is: " + book.author + "\n" + 
				"The book has " + book.numberOfPages + " pages");
		keyboard.close();
		
	}
}