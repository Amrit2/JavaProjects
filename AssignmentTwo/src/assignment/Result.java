package assignment;

/*
 * Result class sets the grade and module according to the input before returning
 * a string representation
 */

public class Result 
{
	private Module module;
	private Grade grade;
	
	/*
	 * Constructor: initializes the module and grade
	 */
	public Result(Module module, Grade grade) 
	{
		this.module = module;
		this.grade = grade;	
	}

	/*
	 * getter for the module
	 * @returns the module 
	 */
	public Module getModule() 
	{
		return module;
	}

	/*
	 * setter for module
	 * @param module: takes in a module to set it to the instance variable module
	 */
	public void setModule(Module module) 
	{
		this.module = module;
	}

	/*
	 * getter for the grade
	 * @returns the grade
	 */
	public Grade getGrade() 
	{
		return grade;
	}

	/*
	 * setter for grade
	 * @param grade: takes in a grade and sets it to instance variable
	 */
	public void setGrade(Grade grade) 
	{
		this.grade = grade;
	}
	
	/*
	 * @returns the string representation of module and grade
	 */
	@Override
	public String toString() 
	{
		return module + " " + grade; 
	}
}
