package lectureCode;

public class Staff extends Person{
	
	private String officeNumber;
	
	
	public String toString()
	{
		String s = super.toString();
		return s+ " "+this.getOfficeNumber();
	}
	
	
	public Staff(String name,int age,Address address,String on)
	{
		super(name,age,address);
		this.setOfficeNumber(on);
	}
	
	
	
	public void setOfficeNumber(String officeNumber)
	{
		this.officeNumber = officeNumber;
	}
	public String getOfficeNumber() 
	{
		return officeNumber;
	}
 


}
