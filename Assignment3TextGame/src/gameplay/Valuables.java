package gameplay;
/**
 * Sets the Valuables's description and the increase in confidence value
 * after admiring it
 * @author Amritpal Kaur, 14865526
 *
 */
public abstract class Valuables extends Consumable {
	private int increaseInConfidence;

	/**
	 * sets description and intialises the confidence increase
	 * @param description of the valuable
	 * @param increaseInConfidence due to the valuable
	 */
	public Valuables(String description, int increaseInConfidence) {
		super(description);
		this.increaseInConfidence = increaseInConfidence;
	}
	
	/**
	 * get/set for increase in health
	 * @return the increase
	 */
	public int getIncreaseInHealth() {
		return increaseInConfidence;
	}

	public void setIncreaseInConfidence(int objectValue) {
		this.increaseInConfidence = objectValue;
	}

	public String outputMessage() {
		return " admires ";
	}
}
