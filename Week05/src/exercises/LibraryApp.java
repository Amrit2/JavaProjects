package exercises;

public class LibraryApp {
	public static void main(String[] args) {
		Library library = new Library(5);
		library.addBook(new Book ("The Lord of the Rings", "J.R.R.Tolkien"));
		library.addBook(new Book ("Harry Potter and the Philosopher's Stone", "J.K. Rowling"));
		library.addBook(new Book ("1984", "George Orwell"));
		library.addBook(new Book ("Where the Whild Things Are", "Mauri Sendak"));
		library.addBook(new Book ("The Hitchhiker's Guide to the Galaxy", "Douglas Adams"));
		
		System.out.println(library);
		
		Book aBook = library.borrow("1984");
		System.out.println("Book borrowed: " + aBook);
	}
}
