package gameplay;
/**
 * Sets the Jewel's description and the increase in health points that occurs
 * due to admiring it
 * @author Amritpal Kaur, 14865526
 *
 */
public class Jewel extends Valuables {
	public Jewel (String description, int increaseInHealth) {
		super(description, increaseInHealth);
	}
	
	@Override
	public String outputMessage() {
		return " admires the shiny jewel.";
	}
	
}
