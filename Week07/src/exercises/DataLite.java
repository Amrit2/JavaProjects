package exercises;

public class DataLite extends DataMobilePackage{

	public DataLite(int minLimit, int textLimit,int dataLimit) {
		super(minLimit, textLimit, dataLimit);		
	}

	@Override
	double dataCost() {		
		return this.dataUsed*0.15;
	}

}
