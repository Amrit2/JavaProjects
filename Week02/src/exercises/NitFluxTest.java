package exercises;

public class NitFluxTest {
	
	public static void main (String[] args) {
		NitFlux obj1 = new NitFlux();
		NitFlux obj2 = new NitFlux();
		NitFlux obj3 = new NitFlux();
		
		obj1.emailAddress = "@123";
		obj1.monthlyPayment = 45;
		obj1.subscriptionPeriod = 2;
		
		obj2.emailAddress = "@1234";
		obj2.monthlyPayment = 454;
		obj2.subscriptionPeriod = 23;
		
		obj3.emailAddress = "@12345";
		obj3.monthlyPayment = 4556;
		obj3.subscriptionPeriod = 25;
		
		System.out.println("total amount paid: " +  obj1.monthlyPayment*obj1.subscriptionPeriod);
		System.out.println("total amount paid: " + obj2.monthlyPayment*obj2.subscriptionPeriod);
		System.out.println("total amount paid: " + obj3.monthlyPayment* obj3.subscriptionPeriod);
	}

}
