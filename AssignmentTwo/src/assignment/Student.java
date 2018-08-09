package assignment;

import java.util.Arrays;

/*
 * This class creates a transcript for each students depending on the results data.
 * It stores the results in an array of type Results before returning the 
 * string representation of the transcript.
 */

public class Student {
	private final static int MAX_TRANSCRIPT_LENGTH = 20; 	// setting a final value for the max transcript length
	private int nResults = 0;								// instance variable for the number of result avaliable for a particular student
	private Result[] transcript;							// instance variable for an array or results
	private String name;									// instance variable for the name of the student
	
	
	/*
	 * Constructor: sets the name to an initial name and initializes the array as a new array
	 * @param name: name of the student 
	 */
	public Student(String name) 
	{
		setName(name);	
		transcript = new Result[20]; 
	}
	
	/*setter for transcript
	 * updates the array of transcripts by adding results of a particular students 
	 * @param module: takes in a module variable of type Module
	 * @param grade: takes in a grade variable of type Grade
	 */
	public void addResultToTranscript(Module module, Grade grade) 
	{
		Result result = new Result(module, grade);			// creating a new instance of the Result object
		if (nResults < MAX_TRANSCRIPT_LENGTH - 1) 
		{													// checking for the total number of results against the maximum limit
			transcript[nResults] = result;					// if the current number of results is lower than max then store the result on the array 
			nResults++;										// increase the number of results
		}
	}
	
	/*
	 * getter for transcript
	 * @returns an array of results 
	 */
	public Result[] getTranscript() 
	{
		Result[] resultTranscript = new Result[nResults]; 	// creating a new instance variable of the Result object
		for (int i = 0; i <= nResults; i++) 
		{													// looping through the total number of results stored
			if (transcript[i] != null) 
			{												// checking to make sure no results is null 
				resultTranscript[i]= transcript[i];			// adding the non null results to the array to be returned
			}
		}
		return resultTranscript;
	}

	
	/*
	 * getter for the student name
	 * @returns the current student name
	 */
	public String getName() 
	{
		return name;
	}

	/*
	 * setter for the student name
	 * @param name: the student name
	 */
	public void setName(String name) 
	{
		this.name = name;
	}
	
	/*
	 * @returns a string representation of the student class which includes the 
	 * student name and the their transcript
	 */
	@Override
	public String toString()
	{
		String arrayResult = Arrays.toString(this.getTranscript()).replace('[', ' ');
		arrayResult = arrayResult.replace(']', ' ');
		return("Transcript for " + this.name + "\n" + arrayResult);	
	}

}
