package assignment;

/*
 * Certification class holds the criteria to see if the student is certified or not
 */
public class Certification 
{
	private boolean satisfied;									// setting the initial state for criteria to false
	private int levelOne = 0;
	private int levelTwo = 0;
	private int levelThree = 0;
	private int levelTwoSelfStudy = 0;
	private int levelThreeTaught = 0;
	private int levelThreeProject = 0;

	/*
	 * Constructor: passes the student variable to criteria
	 */
	public Certification(Student student) 
	{
		this.satisfied = this.checkCriteria(student);
	}

	/*
	 * setter for the criteria
	 * @param student: takes in a student variable
	 */
	public boolean checkCriteria(Student student) 
	{
		Result[] result = student.getTranscript();  		// obtain the transcript and store in a local variable

		for (int i= 0; i < result.length; i++) 				//iterate through the transcript result
		{
			Module module = result[i].getModule();			// obtain the module for a certain result
			Grade grade = result[i].getGrade();				// obtain the grade for a certain result

			if(grade.isPass())								// if the grade is a pass for the levels
			{
				switch (module.getLevel()) {				// check the module for level and increment the correct level module
				case ONE:
					levelOne++;		
					break;
				case TWO:
					levelTwo++;
					switch (module.getType()) {				// check the module for the type and increment the correct level type
					case SELFSTUDY:
						levelTwoSelfStudy++;
						break;
					default:
						break;

					}
					break;
				default:
					levelThree++;
					switch (module.getType()) {
					case TAUGHT:
						levelThreeTaught++;
						break;
					case PROJECT:
						levelThreeProject++;
						break;
					default:
						break;
					}
				}
			}
		}

		// returns true if the criteria is met

		return (levelOne >= 3 && 								//more than 3 modules passed at level 1
				(levelTwo >= 3 && levelTwoSelfStudy > 1) && 	// more than 3 modules passed at level 2 and more than 1 is self study type
				(levelThree >= 4 && levelThreeTaught >= 2) && 	// more than 3 modules passed at level 3 and more than 1 is taught type
				(levelThreeProject >= 1));						// at least one project is passed
	}

	/*
	 * getter for criteria
	 * @returns the state of satisfied
	 */
	public boolean validate() 
	{
		return this.satisfied;									
	}
}
