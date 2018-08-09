package game;

public class DealershipTest {
	public static void main (String[] args) {
		Dealership dealer = new Dealership();
		
		for (int i = 0; i < 5; i++) {
			dealer.addToWaitingList(new Car());
		}
	}
}
