package gameplay;
/**
 * Sets the Character's description and the get/sets of 
 * character's health points
 * @author Amritpal Kaur, 14865526
 *
 */
public abstract class Character extends Entity
{
	private int healthPoints;

	/**
	 * 
	 * @param description of the Character
	 */
	public Character(String description) 
	{
		super(description);	
	}

	protected abstract int dealAttackDamage();					// declaration of the abstract method

	public abstract int defendAttack(Character enemy);

	public void setHealthPoints(int points) 				
	{
			this.healthPoints = points;	
	}

	public int getHealthPoints() 
	{
		return healthPoints;
	}
}
