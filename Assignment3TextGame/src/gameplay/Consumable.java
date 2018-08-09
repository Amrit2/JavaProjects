package gameplay;
/**
 *Sets the Consumables's description and it's state in terms of it 
 *being consumed or not
 * @author Amritpal Kaur, 14865526
 *
 */
public abstract class Consumable extends Pickup {
	private boolean consumed;
	
	public Consumable(String description) {
		super(description);
	}

	/**
	 * 
	 * @return a boolean 
	 */
	public boolean isConsumed() {
		return consumed;
	}

	public void setConsumed(boolean consumed) {				// ensures that state is set to consumed
		this.consumed = consumed;
	}
	
}
