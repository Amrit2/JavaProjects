package exercises;

public abstract class DataMobilePackage extends StandardPackage{

	
	//how much data has the customer used?
	protected int dataUsed;
	
	
	//the limit of data use
	protected int dataLimit;
	//------------------------------------------------------------------------------------------
		public double totalCost(){
			return textCost()+talkCost()+dataCost();
		}
		
		//------------------------------------------------------------------------------------------
	public DataMobilePackage(int minLimit, int textLimit, int dataLimit) {
		super(minLimit, textLimit);	
		this.dataLimit=dataLimit;
	}

	
	public void transfer(int dataAmount){
		if(dataUsed >= dataLimit){
			System.out.println("Sorry, you have reached your limits for transferring data!");
		} 
		else
		{
			dataUsed+=dataAmount;
		}
			
	}
	
	abstract double dataCost();
	
	
	//------------------------------------------------------------------------------------------
		public String toString(){
			return  super.toString()+" Data: ["+this.dataUsed+"/"+this.dataLimit+"]";
		}
	

}
