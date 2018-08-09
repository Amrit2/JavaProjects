package gameplay;
/**
 *Sets the Player's description, inventory, confidence value, weapon
 *and health points
 * @author Amritpal Kaur, 14865526
 *
 */

public class Player extends Character{
	private int confidenceValue;
	private String name;
	private Wieldable weapon;
	private Inventory playerInventory;				

	/**
	 * The constructor sets the description, initializes confidence and inventory,
	 * sets the health points
	 * @param name is of the player is of type String
	 * @param clothesDescription of type string
	 * @param startingHealthPoints for the player
	 * @param startingConfidencePoints for the player
	 */
	public Player(String name, String clothesDescription, int startingHealthPoints, int startingConfidencePoints) { 
		super(clothesDescription);
		this.name = name;
		this.confidenceValue = startingConfidencePoints;
		super.setHealthPoints(startingHealthPoints);
		this.playerInventory = new Inventory();
	}

	/**
	 * get/set confidence value
	 * @return the confidence values
	 */
	public int getConfidenceValue() {
		return confidenceValue;
	}

	public void setConfidenceValue(int confidenceValue) {
		int decreaseConfidenceLevel = super.randomInt(1, this.getConfidenceValue());  //amount of decreases in confidence 
		this.confidenceValue = confidenceValue - decreaseConfidenceLevel;
	}

	/**
	 * get/set for player name
	 * @return the player's name
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * get/set wieldable weapon
	 * @return the weapon
	 */
	public Wieldable getWeapon() {
		return weapon;
	}

	public void setWeapon(Wieldable weapon) {
		this.weapon = weapon;
	}

	public Inventory getPlayerInventory() {
		return playerInventory;
	}

	/**
	 * overriding dealAttackDamage based on the strength of the weapon
	 * @return the damage done
	 */
	@Override
	protected int dealAttackDamage() {
		int strengthOfWeapon = weapon.hit(); 							
		int damage = strengthOfWeapon + (strengthOfWeapon *(this.confidenceValue)/100);
		return damage;
	}

	/**
	 * overriding the defendAttack
	 * @param takes in the monster as enemy
	 * @return the damage
	 */
	@Override
	public int defendAttack(Character enemy) {
		int damageFromEnemy = enemy.dealAttackDamage();
		setHealthPoints(getHealthPoints()- damageFromEnemy);  // sets the health points based on the damage
		this.confidenceValue -= (damageFromEnemy/2);		  // sets the confidence value based on the damage
		return damageFromEnemy;								
	}

	/**
	 * method for the player to admire the valuable 
	 * @param chosenValuable: takes in a valuable
	 */
	public void admire(Valuables chosenValuable) {
		chosenValuable.setConsumed(true);					// sets the valuable's consumed variable
		setConfidenceValue(this.confidenceValue + chosenValuable.getIncreaseInHealth()); // increase the healthpoint of the player
	}

}
