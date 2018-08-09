package exercises;

public enum CruiseShipMembership {
	nonMember(0),
	regular(1),
	elite(6),
	superelite(10),
	gold(15),
	platinum(20);
	
	private int numbers;
	
	private CruiseShipMembership(int numbers) {
		this.setNumbers(numbers);
	}
	
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}
	
	public int getNumbers() {
		return this.numbers;
	}
	
	public String toString()
	{
		return this.name()+ " ("+this.numbers+")";
	}
	
}
