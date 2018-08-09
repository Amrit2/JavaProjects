package gameplay;
/**
 * Sets the monster's description, health points and the probability of 
 * monster appearing
 * @author Amritpal Kaur, 14865526
 *
 */
public abstract class Monster extends Character {
	private int probabilityOfMonsterAppearing;
	private int damage;		
	
	/**
	 * The constructor sets the description and health points, initializes the health points, and the
	 * damage
	 * @param description : String description of the monster
	 * @param healthPoints: health points of the monster
	 */
	public Monster(String description, int healthPoints) { 
		super(description);
		this.setDamage(this.dealAttackDamage()); 
		super.setHealthPoints(healthPoints);
		probabilityOfMonsterAppearing = healthPoints;
	}

	/**
	 * get/set for probability
	 * @return the probability of monster appearing
	 */
	public int getProbabilityOfMonsterAppearing() {
		return probabilityOfMonsterAppearing;
	}

	public void setProbabilityOfMonsterAppearing(int probabilityOfMonsterAppearing) {
		this.probabilityOfMonsterAppearing = probabilityOfMonsterAppearing;
	}

	/**
	 * set/get the damage done 
	 * @return
	 */
	public int getDamage() {
		return damage;
	}

	public void setDamage(int dealableDamage) {
		this.damage = dealableDamage;
	}

	/**
	 * Overriding the dealAttackDamage method
	 * @return the damage
	 */
	@Override
	protected int dealAttackDamage() {
		int r = super.randomInt(1, 10);  				
		return (this.damage + r);
	}

	/**
	 * Overriding the defendAttack method
	 * @return the damage
	 */
	@Override
	public int defendAttack(Character enemy) {
		int damage = enemy.dealAttackDamage(); 					
		int currentHealthPoints = getHealthPoints();
		setHealthPoints(currentHealthPoints - damage);
		return damage;
	}
	
	/**
	 * checks if a monster appears based on a random value
	 * @return a boolean
	 */
	public boolean appear() {
		if (super.getHealthPoints() == 0) {
			return false;
		}
		return this.probabilityOfMonsterAppearing <= super.randomInt(0, 101);			
	}
}
