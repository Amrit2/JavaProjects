package exercises;

public class Book {
	private String title;
	private String author;
	private String isBorrowed;

	public Book(String title, String author) {
		setTitle(title);
		setAuthor(author);
		this.setIsBorrowed(false);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsBorrowed() {
		return isBorrowed;
	}

	public void setIsBorrowed(boolean borrowed) {
		if (borrowed) {
			this.isBorrowed = "Yes";
		}
		else this.isBorrowed = "No";
	}

	public String toString() {

		return this.title + " by " + this.author + " is borrowed: " + this.isBorrowed + "\n";
	}
}
