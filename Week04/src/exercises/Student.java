package exercises;

public class Student {
	private String name;
	private int age;
	private int ID;
	private static int number = 1;	
	Grade grade;
	
	public Student(String name, int age, Grade grade) {
		this.name = name;
		this.age = age;
		this.ID = number++;
		this.setGrade(grade);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumber() {
		return number;
	}
	
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	public String toString() {
		return ("Name: " + this.name + " Age: " + this.age + " ID: " + this.ID + " The grade is: " + this.grade);
	}
}
