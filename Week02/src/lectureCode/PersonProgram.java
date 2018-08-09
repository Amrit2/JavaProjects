package lectureCode;

public class PersonProgram {
	public static void main(String args[]) {
		Person p1;
		p1 = new Person();
		p1.name = "Robin Banks";
		p1.age = 37;
		p1.gender = 'M';
		p1.student = false;
		Address a = new Address();
		a.streetNumber = 742;
		a.streetName = "Oak Street";
		a.suburb = "Birkenhead";
		a.city = "Auckland";
		a.postCode = "0626";
		p1.address = a;
	}
}