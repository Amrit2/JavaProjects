package game;

public class DealershipMaintenanceWaitListFull extends IllegalStateException {
	public int CAPACITY;
	
	public String toString() {
		return this.getClass() + ": capacity is "+ this.CAPACITY;
	}
	public DealershipMaintenanceWaitListFull(int CAPACITY) {
		this.CAPACITY = CAPACITY;
	}
}
