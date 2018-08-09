package exercises;

import java.util.Scanner;

public class TVApplication {

	public static void main(String[] args) {
		Television television = new Television();							// creating a new instance of the Television class
		RemoteControl remoteControl = new RemoteControl(television);		// television object passed to instantiated remote 
																			// control class 

		Scanner keyboard = new Scanner(System.in); 
		int userChoice = 0;
		System.out.println(television);
		
		while (userChoice != 6) {
			System.out.println("\nPress a Button on the Remote Control \n" + 
								"1.Power " + 
								"2.Volume up by 50% " + 
								"3.Volume Down by 50% " + 
								"4.Channel up " + 
								"5.Channel Down " + 
								"6.Go outside");

			userChoice = keyboard.nextInt();								// taking in user input

			String outputMessage = "";
			
			//setting the correct message and altering the attributes according to the user input
			switch(userChoice)
			{
			case 1:
				remoteControl.powerButton();								// calls the powerButton method to change the TV's state
				outputMessage = "Power Button Pressed";						// sets the corresponding output message
				break;
			case 2:
				remoteControl.volumeUpByHalf();
				outputMessage = "Volume Up 50% Button Pressed";
				break;
			case 3:
				remoteControl.volumeDownByHalf();
				outputMessage = "Volume Down 50% Button Pressed";
				break;
			case 4:
				remoteControl.channelUpButton();
				outputMessage = "Channel Up Button Pressed";
				break;
			case 5:
				remoteControl.channelDownButton();
				outputMessage = "Channel Down Button Pressed";
				break;
			default:
				outputMessage = "Going Out";
			}
			
			System.out.println(outputMessage + "\n");
			System.out.println(television);

		}
		keyboard.close();
	}

}
