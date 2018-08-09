package exercises;

public class Student {
	
	private String firstName;
	private String lastName;
	private String ID;
	
	public Student(String firstName, String lastName, String ID) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setID(ID);
	}
	
	public Student(String ID) {
		this.ID = ID;
		this.firstName = "";
		this.lastName = "";
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getFirstName () {
		return this.firstName;
	}
	
	public String getLastName () {
		return this.lastName;
	}
	
	public String getID () {
		return this.ID;
	}
	
	public String toString() {
		return ("Student's first name: " + this.getFirstName() + ", last name: " +
				this.getLastName() + ", ID: " + this.getID());
	}
}
