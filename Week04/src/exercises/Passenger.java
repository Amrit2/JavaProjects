package exercises;

public class Passenger {
	private String name;
	private CruiseShipMembership membership;
	
	public Passenger(String name,CruiseShipMembership membership) {
		this.setMembership(membership);
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CruiseShipMembership getMembership() {
		return membership;
	}
	public void setMembership(CruiseShipMembership membership) {
		this.membership = membership;
	}
	
	@override
	public String toString() {
		return ("Boarding passenger: Passenger [name = " + this.name + ", member = " + this.membership + "]");
	}
	
}
