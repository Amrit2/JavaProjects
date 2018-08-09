package lectureCode;

public class Prescription {

	private String drug;
	private String startDate;
	private int nWeeksRepeat;
	private double dosage;


	
	public double getDosage()
	{
		return this.dosage;
	}
	public void setNWeeksRepeat(int nWeeksRepeat)
	{
		this.nWeeksRepeat = nWeeksRepeat;
	}
	public int getNWeeksRepeat()
	{
		return this.nWeeksRepeat;
	}
	//--------------------------------------------------------
	public String getStartDate()
	{
		return this.startDate;
	}
	//--------------------------------------------------------
	public void setStartDate(String startDate)
	{
		this.startDate = startDate;
	}
	//--------------------------------------------------------
	public String getDrug()
	{
		return this.drug;
	}
	//--------------------------------------------------------
	public void setDrug(String drug)
	{
		//check if drug is empty string or null;
		if(drug == null || drug.isEmpty())
		{
			this.drug = "Unknown";
		}
		else
		{
			this.drug  = drug;
		}
	}
	//--------------------------------------------------------
	@Override
	public String toString()
	{
		return this.drug+ " : "+this.dosage+"MG";
	}
	//--------------------------------------------------------
	public Prescription(String drug,String startDate,int nWeeksRepeat,double dosage)
	{

		this.setDrug(drug);
		this.setStartDate(startDate);
		this.setNWeeksRepeat(nWeeksRepeat);
	//	this.setDosage(dosage);

	}


}
