package examples;

public class RewardsClubTest {
	public static void main(String[] args) {
		for (RewardsClub rc : RewardsClub.values()) {
			System.out.println(rc);
		}
		// we can change the fee for any kind of membership
		System.out.println("\nNew fee for BRONZE:");
		RewardsClub.BRONZE.setFee(100);
		System.out.println(RewardsClub.BRONZE);
	}

}
