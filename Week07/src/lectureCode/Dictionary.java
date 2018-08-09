package lectureCode;

public class Dictionary extends Book
{
	private int nDefinitions;


	public Dictionary()
	{
		super(0);
		this.setnDefinitions(0);
	}



	@Override
	public String toString()
	{
		return super.toString()+ 
				" # defns "+this.nDefinitions;
	}

	public Dictionary(int nPages,int nDefinitions)
	{
		super(nPages);	
		this.setnDefinitions(nDefinitions);			
	}


	public int getnDefinitions() 
	{
		return nDefinitions;
	}

	public void setnDefinitions(int nDefinitions) 
	{
		this.nDefinitions = nDefinitions;
	}


	public double computeRatio()
	{
		
		int nPages = this.getNumberOfPages();
		if(nPages == 0)
		{
			return 0.0;
		}
		
		return this.nDefinitions/nPages;
	}





}
