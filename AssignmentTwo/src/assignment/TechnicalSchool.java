package assignment;

/*
 * TechnicalSchool holds the 13 different modules 
 */
public class TechnicalSchool 
{
	private static Module[] offering; 								// instance variable offering of type Module

	/*
	 * Constructor: initializes the offering array to store the modules
	 */
	public TechnicalSchool() 
	{
		TechnicalSchool.offering = TechnicalSchool.semesterOneModuleOffering(); 
	}

	/*
	 * method of type module that stores the modules
	 * @returns an array of offering of type module
	 */
	static private Module[] semesterOneModuleOffering()
	{
		Module[] offering = new Module[13];

		offering[0] = new Module(Type.TAUGHT, "Programming", "PROG101", Level.ONE);
		offering[1] = new Module(Type.TAUGHT, "Statistics", "STAT102", Level.ONE);
		offering[2] = new Module(Type.TAUGHT, "DatabaseDesign", "DATA222", Level.TWO);
		offering[3] = new Module(Type.TAUGHT, "OOP", "PROG202", Level.TWO);
		offering[4] = new Module(Type.TAUGHT, "InformationSystems", "INSY313", Level.THREE);
		offering[5] = new Module(Type.TAUGHT, "WebServices", "WEBS332", Level.THREE);
		offering[6] = new Module(Type.SELFSTUDY, "TechApplications", "TECH103", Level.ONE);
		offering[7] = new Module(Type.SELFSTUDY, "TheoryOfComputation", "THEO111", Level.ONE);
		offering[8] = new Module(Type.SELFSTUDY, "ModelChecking", "MODC233", Level.TWO);
		offering[9] = new Module(Type.SELFSTUDY, "Topology", "TOPG233", Level.TWO);
		offering[10] = new Module(Type.SELFSTUDY, "Logic", "LOGI321", Level.THREE);
		offering[11] = new Module(Type.PROJECT, "WebAppDev", "PROJ399", Level.THREE);
		offering[12] = new Module(Type.CLIENTPROJECT, "GreatCodeCompany", "EXTO396", Level.THREE);

		return offering;
	}

	/*
	 * getter for the offering instance variable
	 * @returns the offering in an array of type module
	 */
	public Module[] getOffering() 
	{
		return TechnicalSchool.offering;
	}

	/*
	 * setter for a certain module in the offering array
	 * @param code: the code of the module
	 * @returns a module that matched the code
	 */
	public Module lookup (String code) 
	{				
		for (int i = 0; i < offering.length; i++) 
		{													// looping through the array to find the input code
			if (offering[i].getCode().equals(code) )		// look for the module that matches the code
			{												
				return offering[i];							// returns that module
			}
		}
		return null;
	}

	/*
	 * method to check if the student is certified or not
	 * @param student: takes in a student's transcript 
	 * @returns the output of the criteria
	 */
	public boolean isCertified(Student student) 
	{
		Certification certified = new Certification(student);		// passing the student transcript to Certification class
		return certified.validate();								// checking to see if the transcript is certified
	}
	
	// suggested answer
//	public boolean isCertified(Student student)
//	 {int nl1=0,nl2=0,nl3=0;
//	 int l2SelfStudy=0;
//	 int nl3Taught=0;
//	 int nProject=0;
//	 System.out.println("Transcript for "+student.getName());
//	 for(Result r : student.getTranscript())
//	 {Module module = r.getModule();
//	 System.out.println(module.getCode()+ " "+r.getGrade());
//	 if(r.getGrade().isPass())
//	 { if(module.getLevel().equals(Level.one))
//	 {nl1++; }
//	 if(module.getLevel().equals(Level.two))
//	 {nl2++;
//	 if(module.getType().equals(ModuleType.self))
//	 {l2SelfStudy++; } }
//	 if(module.getLevel().equals(Level.three))
//	 {nl3++;
//	 if(module.getType().equals(ModuleType.taught))
//	 {nl3Taught++; }}
//	 if (module.getType().equals(ModuleType.project) ||
//	module.getType().equals(ModuleType.client))
//	 {nProject++;}}}
//	 return
//	nl1>=3&nl2>=3&l2SelfStudy>1&nl3>=4&nl3Taught>=2&nProject>0; }
}
