package gameplay;
/**
 * Sets the Coin's description and the increase in health points that occurs
 * due to admiring it
 * @author Amritpal Kaur, 14865526
 *
 */
public class Coin extends Valuables
{

	public Coin (String description, int increaseInHealth) 
	{
		super(description, increaseInHealth);
	}
	
	@Override
	public String outputMessage() 
	{
		return " admires a Coin.";
	}
	
}
