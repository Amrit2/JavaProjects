package exercises;

public class FlavourTester {

	public static void main(String[] args) {
		Flavour firstFlavour = Flavour.Chocolate;
		Flavour secondFlavour = Flavour.Coffee;
		
		System.out.println(firstFlavour.ordinal());
		System.out.println(secondFlavour.ordinal());
		
		for (int i = 0; i < Flavour.values().length; i++) {
			
			System.out.println(Flavour.values()[i]+" "+Flavour.values()[i].ordinal());
		}
	}

}
