package exercises;

public class CustomerInputTest {
	public static void main (String[] arg) {
		
		Customer customer =  new Customer();
		customer.name = "John";
		customer.accountCode = 12345;
	
		
		Customer secondCustomer =  new Customer();
		secondCustomer.name = "Josh";
		secondCustomer.accountCode = 12335;
		
		Customer thirdCustomer =  new Customer();
		thirdCustomer.name = "Ariel";
		thirdCustomer.accountCode = 123345;
		
		Customer fourthCustomer =  new Customer();
		fourthCustomer.name = "Aril";
		fourthCustomer.accountCode = 13234345;
	}
}
