package exercises;

public class Dog extends Animal {
	
	@Override
	public void feed() {
		this.eat += 5;
		this.happy++;
	}

	public Dog() 
	{
		System.out.println("Dog object instantiated!");
		this.happy = 10;
	}

	public String toString() {
		return "Dog has " + super.toString();
	}
}
