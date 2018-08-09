package examples;

public class Passenger {
	private RewardsClub membership;
	private String name;

	public Passenger(String name, RewardsClub membership) {
		this.name = name;
		this.membership = membership;
	}

	public String toString() {
		return name + "(" + membership + ")";
	}
}
