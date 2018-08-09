package gameplay;
/**
 * Sets the Axe's description and it's high/low values
 * @author Amritpal Kaur, 14865526
 *
 */
public class Sword extends Wieldable {

	public Sword (String description, int low, int high) {
		super(description);
		setHigh(high);
		setLow(low);
	}

}
