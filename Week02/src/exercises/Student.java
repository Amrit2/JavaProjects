package exercises;

public class Student {
	String firstName;
	String lastName;
	String studentID;
	
	public Student(String fn, String lastName, String studentID){
		firstName = fn; // dont't need this. as the names the different
		this.lastName= lastName;
		this.studentID = studentID;
		
		
	}
	
	public Student(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName= lastName;
		this.studentID = "?";
	}
	
	// default constructor 
	public Student(){
		firstName = "UNKNOWN";
		this.lastName= "UNKNOWN";
		this.studentID = "?";
	}
	
	public String toString() {
		return "Students first's name: " + this.firstName + " " +
							"last name: " + this.lastName + " " +
							"Person ID: " + this.studentID;
	}
	
}
