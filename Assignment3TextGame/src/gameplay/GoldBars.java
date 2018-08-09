package gameplay;
/**
 * Sets the GoldBars' description and the increase in health points that occurs
 * due to admiring it
 * @author Amritpal Kaur, 14865526
 *
 */
public class GoldBars extends Valuables{
	
	/**
	 * constructor sets the description and confidence 
	 * @param description of the valuable
	 * @param increaseInConfidence 
	 */
	public GoldBars (String description, int increaseInConfidence) {
		super(description, increaseInConfidence);
	}
	
	@Override
	public String outputMessage() {
		return " admires several gold bars in a neat pile";
	}
}
