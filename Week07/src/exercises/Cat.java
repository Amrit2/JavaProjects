package exercises;

public class Cat extends Animal{
	
	@Override
	public void feed() {
		this.eat++;
		this.happy += 10;
	}
	
	public Cat() {
		System.out.println("Cat object instantiated!");
		this.happy = -10;
	}
	
	public String toString() {
		return "Cat has " + super.toString();
	}
}
