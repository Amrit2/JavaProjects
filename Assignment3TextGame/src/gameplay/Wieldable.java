package gameplay;
/**
 * Sets the Wieldable's description and sets high and low
 * @author Amritpal Kaur, 14865526
 *
 */

public abstract class Wieldable extends Pickup {
	private int high;
	private int low;
	
	public Wieldable(String description) {
		super(description);
	}
	
	public void setHigh(int high) {
		this.high = high;
	}

	public void setLow(int low) {
		this.low = low;
	}

	public int getHigh() {
		return high;
	}

	public int getLow() {
		return low;
	}

	/**
	 * the method hit returns the hit strength of the weapon
	 * @return the value of hit
	 */
	public int hit() {
		int hitNumber = super.randomInt(low, high);
		if (hitNumber > 0) {
			return hitNumber;
		}
		return 0;
	}
}
