package game;

public class DumpTruck extends Vehicle{
	private boolean flatBed;
	
	public DumpTruck() {
		this.engine = new Engine("Truck-Enginer-500");
		this.setTyreCount(8);
	}
	
	public boolean isBedRaised() {
		return flatBed;
	}
	
	public void setBedRaised(boolean bedRaised) {
		this.flatBed = bedRaised;
	}
	
	@Override
	void maintenanceProcedure() {
		this.neutral();
		this.getEngine().stop();
		this.setBedRaised(false);
		System.out.println("Stopping truck for maintenance");
		
	}
	
	

}
