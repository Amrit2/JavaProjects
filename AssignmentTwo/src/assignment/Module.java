package assignment;

/*
 * @author Amritpal Kaur
 * ID: 14865526 
 * This class stores data related to each module of the transcript.
 * It gets the required data in order to initializes and set the variables to correct values
 */

public class Module 
{
	private Type type;				// instance variable for the module type 
	private Level level;			// instance variable for the module level
	private String title; 			// instance variable for the module title
	private String code;			// instance variable for the module code
	
	
	/*
	 * Constructor: sets up the module with specified type, level, title and code
	 * @param type: the type of module
	 * @param title: the title of module
	 * @param code: the code of the module
	 * @param level: the level of the module  
	 */
	public Module(Type type, String title,String code, Level level) 
	{
		this.setCode(code); 		
		this.setLevel(level);
		this.setTitle(title);
		this.setType(type);
	}
	
	
	/*
	 * getter for type
	 * @return current type of the module
	 */
	public Type getType() 
	{
		return type;
	}
	
	/*
	 * setter for type
	 * @param type: uses the current type to set the type
	 */
	public void setType(Type type) 
	{
		this.type = type;
	}
	
	/*
	 * getter for title
	 * @return the current title
	 */
	public String getTitle() 
	{
		return title;
	}
	
	/*
	 * setter for title
	 * @param title: uses the current title to set the title
	 */
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	/*
	 * getter for code
	 * @return the current code
	 */
	public String getCode() {
		return code;
	}
	
	/*
	 * setter for code
	 * @param code: uses the current code to set the code
	 */
	public void setCode(String code) 
	{
		this.code = code;
	}
	
	/*
	 * getter for level
	 * @return the current level
	 */
	public Level getLevel() 
	{
		return level;
	}
	
	/*
	 * setter for level
	 * @param level: uses the current level to set the level
	 */
	public void setLevel(Level level) 
	{
		this.level = level;
	}
	
	/*
	 * String representation of the Module
	 * @return a one line description of module code
	 */
	@Override
	public String toString() 
	{
		return this.code;
	}
}
