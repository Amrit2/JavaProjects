package lectureCode;

public class Person {
	String name;
	byte age;
	char gender;
	boolean student;
	Address address;

	Person(String name, byte age, char gender, boolean student, Address address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.student = student;
		this.address = address;
	}

	Person(String name, char gender, boolean student) {
		this.name = name;
		this.age = 0;
		this.gender = gender;
		this.student = student;
		this.address = null;
	}

	Person() {
		this.name = "UNKNOWN";
		this.age = 0;
		this.gender = 'M';
		this.student = false;
		this.address = null;
	}

	int computeDiscount() {
		int discount = 0;
		if ((this.student) && (this.age >= 10) && (this.age <= 20))
			discount = 50;
		return discount;
	}

	Person oldest(Person aPerson) {
		Person answer = null;
		if (this.age > aPerson.age) {
			answer = this;
		} else {
			answer = aPerson;
		}
		return answer;
	}

	Person oldest(Person aPerson, Person anotherPerson) {
		Person oldestPerson = null;
		if ((this.age > aPerson.age) && (this.age > anotherPerson.age)) {
			oldestPerson = this;
		} else if (aPerson.age > anotherPerson.age) {
			oldestPerson = aPerson;
		} else
			oldestPerson = anotherPerson;
		return oldestPerson;
	}

	public static void main(String[] args) {
		Person p = new Person();
		// …code that changes p's attributes
		int discount = p.computeDiscount();
	}
}
