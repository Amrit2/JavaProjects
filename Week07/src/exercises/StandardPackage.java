package exercises;

public  class StandardPackage {

	//keeps track of how much time talking + texting
	protected int talkUsed;
	protected int textsUsed;

	//stores the number of minutes you can talk and texts you can send.
	protected int talkLimit;
	protected int textLimit;
	//------------------------------------------------------------------------------------------
	public String toString(){
		return  "Talk: ["+this.talkUsed+"/"+this.talkLimit+"] Text: ["+this.textsUsed+"/"+this.textLimit+"]";
	}
	//------------------------------------------------------------------------------------------
	public double totalCost(){
		return textCost()+talkCost();
	}
	//------------------------------------------------------------------------------------------
	public double textCost(){
		return textsUsed*0.05;
	}
	//------------------------------------------------------------------------------------------
	public double talkCost(){
		return talkUsed*0.10;
	}
	//------------------------------------------------------------------------------------------
	public StandardPackage(int minLimit,int textLimit){
		this.talkLimit = minLimit;
		this.textLimit = textLimit; 
	}
	//------------------------------------------------------------------------------------------
	public void talk(int talkDuration){

		if(talkUsed >= talkLimit){
			System.out.println("Sorry, you have reached your limits for talking!");
		} 
		else
		{
			talkUsed+= talkDuration;
		}
	}
	//------------------------------------------------------------------------------------------
	public void sendTexts(int nTextsSent){
		if(textsUsed >= textLimit){
			System.out.println("Sorry, you have reached your limits for texting!");
		}
		else{
			textsUsed+=nTextsSent;	
		}
	}

}
