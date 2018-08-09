package examples;

public enum RewardsClub {
	GOLD(1000), SILVER(750), BRONZE(650), NONMEMBER(0);
	private int fee;

	private RewardsClub(int fee) {
		this.setFee(fee);
	}

	public int getFee() {
		return this.fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String toString() {
		return this.name() + "(" + this.getFee() + ")";
	}
}
