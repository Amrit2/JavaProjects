package exercises;

public class RemoteControl {

	Television television = new Television();

	// constructor to update the television class
	public RemoteControl(Television television) {
		this.television = television;
	}

	//power method to turn the TV on or off
	public void powerButton() {

		if (!television.getPower())
			television.setPower(true);							// turns the TV on if it's off
		else
			television.setPower(false); 						// turn is off if the TV is on 
	}

	//decreases the channel
	public void channelDownButton() {
		if (television.getPower()) {
			int currentChannel = television.getChannel();		// checking the current channel
			if (currentChannel == 1) {
				television.setChannel(10);						// ensure if down button is pressed the channel rolls over to 10 from 1
			} 
			else {
				int channel = currentChannel - 1;				// else decreases the channel 
				television.setChannel(channel);
			}
		}

	}

	//increases the channel
	public void channelUpButton() {
		if (television.getPower()) {
			int currentChannel = television.getChannel();

			if (currentChannel == 10) {
				television.setChannel(1);					// ensures the channel is set to 1 if the current is 10
			} 
			else {
				int channel = currentChannel + 1;
				television.setChannel(channel);
			}
		}

	}

	
	// increases the volume by 50%
	public void volumeUpByHalf() {
		if (television.getPower()) {
			for (int i = 0; i < 50; i++) {					// increases the volume by 50
				television.volumeUp();
			}
		}
	}

	//decreases the volume by 50%
	public void volumeDownByHalf() {
		if(television.getPower()){
			for (int i = 0; i < 50; i++) {					// decreases the volume by 50
				television.volumeDown();
			}

		}
		
	}
}
