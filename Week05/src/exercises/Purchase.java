package exercises;

public class Purchase {
	private String book;
	private double price;
	
	public Purchase(String book, double price) {
		this.book = book;
		this.price = price;
	}
	
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return ("Book: " + this.book + "\nPrice: " + this.price);
	}
}
