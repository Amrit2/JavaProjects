package gameplay;
/**
 * Sets the MoneyBag's description and the increase in health points that occurs
 * due to admiring it
 * @author Amritpal Kaur, 14865526
 *
 */
public class MoneyBag extends Valuables {
	
	public MoneyBag (String description, int increaseInHealth) {
		super(description, increaseInHealth);
	}
	
	@Override
	public String outputMessage() {
		return " admires Money Bag.";
	}
}
