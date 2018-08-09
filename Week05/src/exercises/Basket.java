package exercises;

public class Basket {
	private Purchase[] purchaseArray;
	private int nPurchases;
	
	public Basket (int size) {
		if (size <= 0) {
			size = 10;
		}
		purchaseArray = new Purchase[size];
		this.nPurchases = 0;
	}
	
	public void addPurchase(Purchase p) {
		if(this.nPurchases<this.purchaseArray.length)
		{
			purchaseArray[nPurchases]= p;
			nPurchases++;
		}
	}
	
	public int getNPurchases() {
		return this.nPurchases;
	}
	
	public Purchase getMostExpensive() {
		Purchase max = purchaseArray[0];
		for (int i = 0; i< purchaseArray.length; i++) {
			if (purchaseArray[i].getPrice() > max.getPrice()) {
				max = purchaseArray[i];
			}
		}
		return max;
	}
	
	public Purchase[] getPurchases() {
		Purchase[] temp = new Purchase[nPurchases];
		for (int i = 0; i < nPurchases; i++) {
			if (purchaseArray[i] != null) {
				temp[i]= purchaseArray[i];
			}
		}
		return temp;
	}
	
	public double total() {
		double totalPrice = 0;
		for (int i = 0; i< purchaseArray.length; i++) {
			 totalPrice += purchaseArray[i].getPrice();
		}
		return totalPrice;
	}
	
	public void printReceipt() {
		for (Purchase p: this.purchaseArray) {
			System.out.println(p);
		}
		System.out.println(this.total());
	}
}
