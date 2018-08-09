package lectureCode;

public class Book
{	
	private int nPages;

	@Override
	public String toString()
	{
	
		return "Number of Pages: "+this.nPages;
	}

	
	
	
	public Book(int nPages)
	{
		this.setNumberOfPages(nPages);

	}

	public int getNumberOfPages()
	{		
		return this.nPages;
	}

	public void setNumberOfPages(int nPages)
	{
		this.nPages = nPages;
	}
}