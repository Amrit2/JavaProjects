package gameplay;
/**
 * Sets the Ring's description and the increase in health points that occurs
 * due to admiring it
 * @author Amritpal Kaur, 14865526
 *
 */
public class Ring extends Valuables {
	public Ring (String description, int increaseInHealth) {
		super(description, increaseInHealth);
	}
	
	@Override
	public String outputMessage() {
		return " admires a Ring.";
	}
	
}
