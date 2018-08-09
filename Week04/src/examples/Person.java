package examples;

public class Person 
{
	private String name;
	private int age; 
	private boolean student;
	private char gender;



	public Person(String name,int age,boolean student,char gender){
		this.setName(name);
		this.age=age; 
		this.student=student;
		this.gender = gender;
	}

	public Person oldest(Person aPerson){
		if(this.age>aPerson.age)
		{
			return this;
		}
		else	
		{
			return aPerson;
		}
	}

	public int computeDiscount()
	{
		if((this.student)&&(this.age>=10)&&(this.age <= 20))
		{ 
			return 50; 
		}
		else	
		{
			return 0;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
