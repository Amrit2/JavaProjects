package game;

public abstract class Vehicle implements GearStick {
	private int tyreCount;
	protected Engine engine;
	abstract void maintenanceProcedure();
	
	public int getTyreCount() {
		return tyreCount;
	}
	
	public void setTyreCount(int tyreCount) {
		this.tyreCount = tyreCount;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	@Override
	public void neutral() {
		System.out.println("The vehicle is in neutral");
	}
	
	@Override
	public void drive() {
		System.out.println("The vehicle is in drive");
	}
	
	@Override
	public void reverse() {
		System.out.println("The vehicle is reversing");
	}
}
