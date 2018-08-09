package exercises;

import java.util.Arrays;

public class Library {
	private Book[] books;
	
	
	public Library(int capacity) {
		if (capacity < 1) {
			capacity = 10;
		}
		books = new Book[capacity];
	}
	
	public boolean addBook(Book book) {
		for (int i= 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				return true;
			}
		}
		return false;
	}
	
	public Book borrow(String title) {
		for (int i = 0; i< books.length; i++) {
			Book book = new Book (books[i].getTitle(), books[i].getAuthor());
			if (books[i].getTitle().equals(title)) {
				book.setIsBorrowed(true);;
				return book;
			}
			book.setIsBorrowed(false);
			
		}
		return null;
	}
	
	public String toString() {
		String books = Arrays.toString(this.books).replace('[', ' ');
		books = books.replace(']', ' ');
		books = books.replace(',', ' ');
		return "Contents of the Library \n" + books + "\n"; 
	}
}
