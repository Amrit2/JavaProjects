package exercises;

public class ExceptionBasics2 {
	static boolean CAUSE_EXCEPTION = true;

	public static void main(String args[]) {
		for (int i = 0; i < 10; i++) {
			try {
				if (CAUSE_EXCEPTION)
					throw new Exception("This is an exception");
			} catch (Exception e) {
				System.err.println((i + 1) + " Exception caught!");
			}
		}
	}
}
