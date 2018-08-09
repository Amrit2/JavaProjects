package game;
import java.util.LinkedList;
import java.util.Queue;

public class Dealership {
	private Queue<Vehicle> waitingList;
	public static int CAPACITY = 5;
	
	private void maitenance (Vehicle v) {
		v.maintenanceProcedure();
	}
	
	public void addToWaitingList (Vehicle v) throws DealershipMaintenanceWaitListFull{
		if (this.waitingList.size() >= 5)
			throw new DealershipMaintenanceWaitListFull(CAPACITY);
		this.waitingList.add(v);
	}
	
	public void serviceNextInWaitingList() {
		Vehicle v = this.waitingList.remove();
		this.maitenance(v);
	}
	
	public Dealership() {
		this.waitingList = new LinkedList<Vehicle>();
	}
}
