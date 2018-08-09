package examples;

public class CarWithDriver {
	private int speed;//speed of this car
	private Person driver;

	//constructor
	public CarWithDriver(Person driver)
	{
		this.driver=driver;
		this.setSpeed(0);
	}
	
	//method to get the speed of the car
	public int getSpeed()
	{
		return speed;
	}

	//method to set the speed of the car
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}


	//method to display the speed of the car
	public void displaySpeed()
	{
		System.out.println(this.driver.getName()+" is driving with speed: "+getSpeed());
	}

}
