package gameplay;
/**
 *Sets the Food's description and the get/set methods for 
 *increase in health points that occurs due to eating it
 * @author Amritpal Kaur, 14865526
 *
 */
public abstract class Food extends Consumable {
	private int increaseInHealthPoints;

	/**
	 * Constructor sets the description and initializes the increase in health points
	 * @param description
	 * @param increaseInHealth
	 */
	public Food(String description, int increaseInHealth) {
		super(description);
		this.increaseInHealthPoints = increaseInHealth; 
	}

	public int getIncreaseInHealthPoints() {
		return increaseInHealthPoints;
	}

	public void setIncreaseInHealthPoints (int value) {
		this.increaseInHealthPoints = value;
	}
}
