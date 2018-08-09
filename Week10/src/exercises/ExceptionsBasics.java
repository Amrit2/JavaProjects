package exercises;

public class ExceptionsBasics {
	static boolean CAUSE_EXCEPTION = false;
	
	public static void main(String[] args) {
		try {
			System.out.println("Try");
			if (CAUSE_EXCEPTION) 
				throw new Exception("this is exception");
			System.out.println("End of try");
			
		} catch (Exception e) {
			System.err.println("Catch block" + e);
		}
		finally {
			System.out.println("Finally block");
		}

	}

}
