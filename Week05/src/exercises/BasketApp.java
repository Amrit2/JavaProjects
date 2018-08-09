package exercises;

public class BasketApp {
	public static void main(String[] args) {
		Basket basket = new Basket(10);
		basket.addPurchase( new Purchase("Book",4.25));
		basket.addPurchase( new Purchase("CD",44.90));
		basket.addPurchase( new Purchase("Computer",42.39));
		basket.addPurchase( new Purchase("Pencil",3.72));
		basket.addPurchase( new Purchase("Pen",7.45));
		basket.addPurchase( new Purchase("Chair",83.10));
		basket.addPurchase( new Purchase("Whiteboard",21.02));
		basket.addPurchase( new Purchase("Rubik's Cube",9.93));
		basket.addPurchase( new Purchase("Stapler",18.64));
		basket.addPurchase( new Purchase("table",388.68));
		
		System.out.println("Most expensive purchase: "+basket.getMostExpensive());
		basket.printReceipt();
	}
}
