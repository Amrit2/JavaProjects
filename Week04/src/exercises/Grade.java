package exercises;

public enum Grade {
	Aplus(90,100,true),
	A(85,90, true),
	Aminus(80,85, true),
	Bplus(75,80, true),
	B(70,75, true),
	Bminus(65,70,true),
	Cplus(60,65, true),
	C(55,60, true),
	Cminus(50,55, true),
	D(50,55,false);
	
	private int low;
	private int high;
	private boolean pass;
	
	private Grade() {
		this(90,100,true);
	}
	
	private Grade(int low, int high, boolean pass) {
		this.setLow(low);
		this.setHigh(high);
		this.setPass(pass);
	}

	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public boolean isPass() {
		return pass;
	}

	public void setPass(boolean pass) {
		this.pass = pass;
	}
}
