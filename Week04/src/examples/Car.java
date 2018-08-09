package examples;

/*
 * A simple class that maintains an instance variable storing an
 * integer value representing the speed of the car. *
 * The class contains get and set methods and a
 * method to display the speed of the car * */

public class Car {
	private int speed;// speed for this car
	//-------------------------------------------------------
	// method to get the speed of the car
	public int getSpeed()
	{
		return speed;
	}
	//-------------------------------------------------------
	// method to set the speed of the car
	public void setSpeed(int speed) 
	{
		this.speed = speed; 
	}
	//-------------------------------------------------------
	// method to display the speed of the car
	public void displaySpeed() 
	{
		System.out.println("car speed is " + getSpeed()); 
	}
}