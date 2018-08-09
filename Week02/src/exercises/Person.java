package exercises;

public class Person {
	int age;
	double weight;
	boolean student;
	char gender;
	
	public Person() {
		this.age = 20;
		this.weight = 60.56;
		this.student = true;
		this.gender = 'f';
	}
	
	public Person(int age, double weight, boolean student, char gender) {
		this.age = age;
		this.weight = weight;
		this.student = student;
		this.gender= gender;
	}
}
