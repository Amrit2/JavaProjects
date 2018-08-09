package lectureCode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuSystemWithExceptions {
	public static Scanner scanner;
	public static void inputBoolean() throws InputMismatchException,IllegalStateException
	{
		System.out.println("Please input a Boolean");
		scanner.nextBoolean();		
		System.out.println("Finished inputBoolean()");
	}
	public static void inputDouble() throws InputMismatchException,IllegalStateException
	{
		System.out.println("Please input a double");
		scanner.nextDouble();
		inputBoolean();
		System.out.println("Finished inputDouble()");
	}
	public static void inputInteger() throws InputMismatchException,IllegalStateException
	{			
		System.out.println("Please input an integer");
		int value=scanner.nextInt();
		if(value<0) scanner.close();
		inputDouble();
		System.out.println("Finished inputInteger()");
	}
	public static void inputMenu()
	{
		try
		{
			inputInteger();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Catch: input mismatch!");
			scanner.next();//flush the input
		}	
		finally
		{
			System.out.println("End of input");	
		}
	}	
	public static void main(String args[]) 
	{
		scanner = new Scanner(System.in);
		try
		{
			inputMenu();			
		}
		catch(IllegalStateException e)
		{
			System.out.println("scanner unexpectedly closed");
		}
	}	
}
