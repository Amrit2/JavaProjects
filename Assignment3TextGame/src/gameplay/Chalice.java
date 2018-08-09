package gameplay;
/**
 *Sets the Chalice's description and the increase in health that
 *occurs due to admiring it
 * @author Amritpal Kaur, 14865526
 *
 */
public class Chalice extends Valuables 
{
	public Chalice (String description, int increaseInHealth) 
	{
		super(description, increaseInHealth);
	}
	
	@Override
	public String outputMessage() 					// overriding the output to custom print to the console
	{
		return " admires A gold Chalice.";
	}
}
