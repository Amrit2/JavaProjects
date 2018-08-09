package exercises;

public class CoinChanger {
	private int ten;
	private int twenty;
	private int fifty;
	private int oneDollar;
	private int twoDollar;
	
	private int dollars;
	private double cents;
	
	public CoinChanger(int ten, int twenty, int fifty, int oneDollar, int twoDollar) {
		computeChange(ten, twenty, fifty, oneDollar, twoDollar);
	}
	
	public int getTen() {
		return this.ten;
	}
	
	public int getTwenty() {
		return this.twenty;
	}
	
	public int getFifty() {
		return this.fifty;
	}
	
	public int getOneDollar() {
		return this.oneDollar;
	}
	
	public int getTwoDollar() {
		return this.twoDollar;
	}

	public void computeChange(int ten, int twenty, int fifty, int oneDollar, int twoDollar) {
		int totalCents = ten*10 + twenty*20 + fifty*50 + oneDollar*100 + twoDollar*200;
		
		setDollars(totalCents);
		setCents(totalCents);
	}
	
	private void setDollars(int totalCents) {
		this.dollars = totalCents / 100 ;
	}
	
	private void setCents (int totalCents) {
		this.cents = totalCents % 100;
	}
	
	public String toString() {
		return ("The total value of the coin collection is: $" + this.dollars + "." + this.cents);
	}
}
