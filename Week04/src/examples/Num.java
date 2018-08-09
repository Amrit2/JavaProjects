package examples;


/**
 * Source: Java Foundations (Lewis et al.) This class represents a single
 * integer as an object.
 * 
 * @author Kjohnson & Jamal
 */
public class Num 
{
	private int value;

	/**
	 * Constructor: Sets up the new Num object, storing an initial value.
	 * 
	 * @param update
	 *            : an integer value
	 */
	public Num(int update) 
	{
		value = update;
	}

	/**
	 * Sets the stored value to the newly specified value.
	 * 
	 * @param update
	 *            : an integer value
	 */
	public void setValue(int update) 
	{
		value = update;
	}

	/**
	 * Returns the stored integer value as a string.
	 */
	public String toString() 
	{
		return value + "";
	}
}