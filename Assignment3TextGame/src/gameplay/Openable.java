package gameplay;
/**
 *Sets the Food's description and the Pickups
 * @author Amritpal Kaur, 14865526
 *
 */
public abstract class Openable extends Pickup {
	private boolean locked;
	private Pickup contents;

	/**
	 * The constructor sets the description and the contents of the chest as well as it's state
	 * of being locked or not
	 * @param description is passed as a String
	 * @param pickup item is passed of type Pickup
	 */
	public Openable(String description, Pickup pickup) {
		super(description);
		this.locked = true;
		contents = pickup;
	}
	
	/**
	 * get/set for the state of Openable as a boolean
	 * @param locked is of type boolean
	 */
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
	public boolean isLocked() {
		return locked;
	}
	
	/**
	 * get/set the contents of the Openable
	 * @param contents
	 */
	public void setContents(Pickup contents) {
		this.contents = contents;
	}
	
	public Pickup getContents() {
		return contents;
	}
}
