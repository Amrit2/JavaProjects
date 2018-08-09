package exercises;

import java.util.Scanner;

public class CruiseShipBoarder {

	public static void main(String[] args) {
		boolean done=false;
		System.out.println("Now boarding passengers");
		Scanner scan = new Scanner(System.in);
		while(!done)
		{
			
			System.out.println("-------------------");
			System.out.println("Enter the name of the passenger: ");
			String name = scan.nextLine();

			System.out.println("How many cruises has the passenger taken already?");
			int nCruises = scan.nextInt();

			CruiseShipMembership member = CruiseShipMembership.values()[0];

			int size = CruiseShipMembership.values().length-1;
			
			for(int i=0;i<size;i++)
			{
				int leftBound = CruiseShipMembership.values()[i].getNumbers();
				int rightBound = CruiseShipMembership.values()[i+1].getNumbers();				
				if (nCruises>=leftBound&&nCruises<rightBound)
				{
					member =CruiseShipMembership.values()[i];
				}
				else if(nCruises>=rightBound)
					member =CruiseShipMembership.values()[i+1];
				
			}
	
			Passenger p = new Passenger(name,member);
			System.out.println("Boarding passenger: "+p);
			scan.nextLine();
			
		}
	}

}
