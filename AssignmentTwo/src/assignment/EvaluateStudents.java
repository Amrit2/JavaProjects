package assignment;

/*
 * EvaluateStudents uses the TechnicalSchool and Student class to instantiate
 * and populate the transcript of the student before displaying it
 */

public class EvaluateStudents
{
	public static Student axel()
	{
		TechnicalSchool ts = new TechnicalSchool();						// creating a new instance of the TechnicalSchool class
		Student rb = new Student("Axel");								// creating a new instance of the Student class

		rb.addResultToTranscript(ts.lookup("PROG101"),Grade.BPLUS);		// sending the results to the be added to the transcript
		rb.addResultToTranscript(ts.lookup("STAT102"),Grade.C);
		rb.addResultToTranscript(ts.lookup("DATA222"),Grade.A);		
		rb.addResultToTranscript(ts.lookup("INSY313"),Grade.AMINUS);
		rb.addResultToTranscript(ts.lookup("WEBS332"),Grade.A);
		rb.addResultToTranscript(ts.lookup("TECH103"),Grade.D);		
		rb.addResultToTranscript(ts.lookup("MODC233"),Grade.B);
		rb.addResultToTranscript(ts.lookup("TOPG233"),Grade.B);		
		rb.addResultToTranscript(ts.lookup("PROJ399"),Grade.CMINUS);
		rb.addResultToTranscript(ts.lookup("EXTO396"),Grade.C);

		System.out.println(rb);
		return rb;
	}

	public static Student kate()
	{
		TechnicalSchool ts = new TechnicalSchool();
		Student rb = new Student("Kate");

		rb.addResultToTranscript(ts.lookup("PROG101"),Grade.APLUS);
		rb.addResultToTranscript(ts.lookup("STAT102"),Grade.AMINUS);		
		rb.addResultToTranscript(ts.lookup("TECH103"),Grade.BPLUS);
		rb.addResultToTranscript(ts.lookup("MODC233"),Grade.A);
		rb.addResultToTranscript(ts.lookup("TOPG233"),Grade.C);
		rb.addResultToTranscript(ts.lookup("DATA222"),Grade.A);
		rb.addResultToTranscript(ts.lookup("INSY313"),Grade.BPLUS);
		rb.addResultToTranscript(ts.lookup("WEBS332"),Grade.AMINUS);
		rb.addResultToTranscript(ts.lookup("PROJ399"),Grade.B);
		rb.addResultToTranscript(ts.lookup("EXTO396"),Grade.B);

		System.out.println(rb);
		return rb;
	}

	public static Student jim()
	{
		TechnicalSchool ts = new TechnicalSchool();
		Student rb = new Student("Jim");

		rb.addResultToTranscript(ts.lookup("PROG101"),Grade.A);
		rb.addResultToTranscript(ts.lookup("STAT102"),Grade.BPLUS);
		rb.addResultToTranscript(ts.lookup("DATA222"),Grade.CPLUS);

		rb.addResultToTranscript(ts.lookup("PROG202"),Grade.C);
		rb.addResultToTranscript(ts.lookup("INSY313"),Grade.C);
		rb.addResultToTranscript(ts.lookup("WEBS332"),Grade.CPLUS);
		rb.addResultToTranscript(ts.lookup("TECH103"),Grade.CMINUS);

		rb.addResultToTranscript(ts.lookup("THEO111"),Grade.D);
		rb.addResultToTranscript(ts.lookup("MODC233"),Grade.APLUS);
		rb.addResultToTranscript(ts.lookup("TOPG233"),Grade.A);
		rb.addResultToTranscript(ts.lookup("LOGI321"),Grade.B);
		rb.addResultToTranscript(ts.lookup("PROJ399"),Grade.BMINUS);
		rb.addResultToTranscript(ts.lookup("EXTO396"),Grade.APLUS);
		
		System.out.println(rb);
		return rb;
	}

	public static Student robin()
	{
		TechnicalSchool ts = new TechnicalSchool();
		Student rb = new Student("Robin");

		rb.addResultToTranscript(ts.lookup("PROG101"),Grade.C);		
		rb.addResultToTranscript(ts.lookup("DATA222"),Grade.C);

		rb.addResultToTranscript(ts.lookup("INSY313"),Grade.CPLUS);
		rb.addResultToTranscript(ts.lookup("WEBS332"),Grade.CPLUS);
		rb.addResultToTranscript(ts.lookup("TECH103"),Grade.CPLUS);

		rb.addResultToTranscript(ts.lookup("MODC233"),Grade.CMINUS);
		rb.addResultToTranscript(ts.lookup("TOPG233"),Grade.CMINUS);

		rb.addResultToTranscript(ts.lookup("PROJ399"),Grade.APLUS);	
		
		System.out.println(rb);
		return rb;
	}

	public static void main(String[] args) 
	{
		TechnicalSchool ar = new TechnicalSchool();
		
		System.out.println(ar.isCertified(EvaluateStudents.robin()) + "\n");
		System.out.println(ar.isCertified(EvaluateStudents.kate()) + "\n");
		System.out.println(ar.isCertified(EvaluateStudents.axel()) + "\n");
		System.out.println(ar.isCertified(EvaluateStudents.jim()) + "\n");	
		
	}
}
