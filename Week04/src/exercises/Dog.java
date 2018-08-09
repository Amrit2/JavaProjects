package exercises;

public class Dog {
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	public int ageInPersonYears() {
		int age = this.age*7;
		return age;
	}
	
	public String toString() {
		return ("The name of the dog is " + this.name + " and the age is " + this.age + " which is " + this.ageInPersonYears() + " in person years.");
	}
}
