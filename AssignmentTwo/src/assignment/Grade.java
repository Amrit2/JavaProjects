package assignment;

/*
 * Grade is an enumerated type which stores a list of Grade values with boundaries for each mark.
 */

public enum Grade 
{
	APLUS(90,100,true),
	A(85,90, true),
	AMINUS(80,85, true),
	BPLUS(75,80, true),
	B(70,75, true),
	BMINUS(65,70,true),
	CPLUS(60,65, true),
	C(55,60, true),
	CMINUS(50,55, true),
	D(50,55,false);
	
	private int low;			// instance variable for creating the lower limit of the grade
	private int high;			// instance variable for creating the upper limit of the grade
	private boolean pass;		// boolean instance variable to indicate if the grade is a pass or fail
	
	
	/*
	 * Constructor: initializes the lower, upper and pass variable for the grade list
	 * @param low: sets the lower limit
	 * @param high: sets the upper limit
	 * @param pass: sets the pass/fail
	 */
	private Grade(int low, int high, boolean pass) 
	{
		this.setLow(low);
		this.setHigh(high);
		this.setPass(pass);
	}

	/*
	 * getter for the lower limit of the range
	 * @returns the lower limit
	 */
	public int getLow() {
		return low;
	}

	/*
	 * setter for the lower limit
	 * @param low: takes in a lower limit and sets it to the instance variable 
	 */
	public void setLow(int low) 
	{
		this.low = low;
	}

	/*
	 * getter for the higher limit
	 * @returns the upper limit
	 */
	public int getHigh() {
		return high;
	}

	/*
	 * setter for the higher limit
	 * @param high: takes in the higher limit and sets it to the instance variable 
	 */
	public void setHigh(int high) 
	{
		this.high = high;
	}

	/*
	 * getter for pass
	 * @returns a true if it's a pass else returns false
	 */
	public boolean isPass() 
	{
		if (this.pass) 
		{
			return true;
		}
		return false;
	}

	/*
	 * setter for pass
	 * @param pass: takes in a pass to set it to the instance variable
	 */
	public void setPass(boolean pass) 
	{
		this.pass = pass;
	}
	
	
	/*
	 * @returns a string representation of the grade
	 */
	@Override
	public String toString() 
	{
		return this.name();
	}
}
