package gameplay;

/**
 * Sets the Axe's description and it's high/low values
 * @author Amritpal Kaur, 14865526
 *
 */
public class Axe extends Wieldable						// gives the Axe access to Wieldable's methods
{
	
	/**
	 * @param description of the weapon
	 * @param low is of type int
	 * @param high is of type int
	 */
	public Axe (String description, int low, int high) 
	{
		super(description);
		setHigh(high);
		setLow(low);
	}
}
