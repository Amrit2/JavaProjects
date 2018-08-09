package lectureCode;

public class BookStore {


	private Book[] store;
	private int location;

	public int getLocation() 
	{
		return location;
	}


	public BookStore(int capacity)
	{
		this.store = new Book[capacity];
		this.location = 0;


	}




	/**
	 * Determines the next available position in the store
	 * to place aBook... if there is any. 
	 * 
	 * */

	public void add(Book aBook)
	{

		if(!(location >= this.store.length))
		{
			store[location] = aBook;
			location = location+1;
		}
	}



	public Book findMinPrice() 
	{
		if(this.store.length == 0)
		{
			return null;
		}
		Book minPriceBook = this.store[0];
		for(int i=1;i<this.getLocation();i++)
		{
			Book compareBook = this.store[i];
			if(minPriceBook.getPrice()>compareBook.getPrice())
			{
				minPriceBook=compareBook;	
			}
		}
		return minPriceBook;

	}

	public static void main(String[] args)
	{
		BookStore bs = new BookStore(5);

		 

		bs.add(new Book("Book1",0.99));
		bs.add(new Book("Book2",1.00));


		System.out.println(bs.findMinPrice());




	}






}
