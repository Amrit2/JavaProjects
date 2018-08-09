package game;

public class Car extends Vehicle{
	private boolean boot;
	
	public Car() {
		this.engine = new Engine("Car-Enginer-5000");
		this.setTyreCount(4);
	}

	public boolean isBootOpen() {
		return boot;
	}
	
	public void setBoot(boolean boot) {
		this.boot = boot;
	}
	@Override
	void maintenanceProcedure() {
		this.neutral();
		this.getEngine().stop();
		System.out.println("Stopping car for maintenance");
		
	}
}
