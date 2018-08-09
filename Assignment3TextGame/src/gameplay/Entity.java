package gameplay;
import java.util.Random;
/**
 *Sets the Entity's description and id
 * @author Amritpal Kaur, 14865526
 *
 */

public abstract class  Entity {
	private String description;
	private String id;
	
	/**
	 * initializes the id and description
	 * @param description
	 */
	public Entity(String description) {
		this.description = description;
		this.id = this.getClass().getSimpleName();
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	
	/**
	 * Generates a random number between a max and value
	 * @param x the low value
	 * @param y the high value
	 * @return a random number
	 */
	protected int randomInt(int x, int y) {				
		return new Random().nextInt(y)+x;
	}
	
	/**
	 * A method for comparing strings, returns true if same else false
	 * @param id as an input string
	 * @return a boolean 
	 */
	public boolean compareID (String id) {				
		 if (this.id.equalsIgnoreCase(id)) {
			 return true;
		 }
		 else 
			 return false; 
	}
	
	public String toString() {
		return this.id;
	}
}
