package exercises;

import java.util.Random;
import java.util.Scanner;
//-----------------------------------------------------------------------------
public class SparkPlugApp {
	static StandardPackage[] packages;
	static Scanner keyboard;
	
	private static void printPackages(){
		for(int i=0;i<packages.length;i++)
		{
			System.out.println(i+": "+packages[i]);
		}
		System.out.println(packages.length+": stop.");
	}
	//-----------------------------------------------------------------------------
	private static void activityMenu(StandardPackage standard) {

		Random r = new Random();
		boolean notDone=true;
		
		while(notDone){
			System.out.println("1. Talk 2. Text 3. Data 4. Choose another plan");
			int selection = keyboard.nextInt();
			switch(selection){
			case 1:
				standard.talk(r.nextInt(100));
				break;
			case 2:
				standard.sendTexts(r.nextInt(100));
				break;
			case 3:
				if(standard instanceof DataMobilePackage){
					DataMobilePackage data = (DataMobilePackage) standard;
					data.transfer(r.nextInt(500));					
				} else
				{
					System.out.println("Sorry, you don't have a data plan!");
				}
				break;
			default:
				notDone=false;
				break;
			}
			System.out.printf(standard+ " Amount owing on account is: $%.2f\n",standard.totalCost());
		}
	}
	//-----------------------------------------------------------------------------
	public static void main(String[] args) {
		packages = new StandardPackage[3];

		packages[0] = new StandardPackage(10,100);
		packages[1] = new DataLite(20,56,1024);
		packages[2] = new DataHeavy(30,156,1024*5);

		System.out.println("Please select a mobile phone package.");

		keyboard = new Scanner(System.in);
		int menuSelection = 0;
		boolean notDone = true;
		while(notDone){
			printPackages();
			menuSelection = keyboard.nextInt();
			if ((menuSelection >= 0) && (menuSelection < packages.length))
			{
				System.out.println(packages[menuSelection]);
				activityMenu(packages[menuSelection]);

			}else
			{
				notDone=false;
			}
		}
	}
}