package exercises;

public class Television {
	
	//instance variable for the television class
	private boolean power;
	private int channel;
	private int maxChannel;
	private int volume;

	//default constructor that initializes the attribute of the television class
	public Television() {
		this.channel = 1;
		this.volume = 0;
		this.maxChannel = 10;
		this.power = false;
	}

	//constructor that sets the 
	public Television(int max) {
		if (max < 2) {
			this.maxChannel = 10;
		}
		this.maxChannel = max;
	}

	//set method for power 
	public void setPower(boolean powerInput) {
		this.power = powerInput;
	}

	public boolean getPower() {
		return power;
	}

	// set method for channel
	public void setChannel(int channel) {
		if (channel > 0 && channel <= this.maxChannel) {  			// ensures the channel stays within 0 and the max channel (10)
			this.channel = channel;
		}
	}

	// get method to return the channel
	public int getChannel() {
		return this.channel;
	}

	// set method for volume 
	private void setVolume(int volume) {
		if (volume >= 0 && volume <= 100) { 						// ensures that the volume stays between 0 and 100
			this.volume = volume;
		}
	}

	// get method to return the volume
	public int getVolume() {
		return this.volume;
	}

	// decreases the volume by 1%
	public void volumeDown() {
		if (volume > 0 && volume <= 100) {  				// ensures volume doesn't go below 0 and over 100 (inclusive)
			setVolume(this.volume -= 1);
		}
	}

	// increases the volume by 1%
	public void volumeUp() {
		if (volume >= 0 && volume < 100) {					// ensure volume doesn't go over 100 and below 0 (inclusive)
			setVolume(this.volume += 1);
		}
	}

	// get method to return max channel
	public int getMaxChannel() {
		return this.maxChannel;
	}

	// returns a string representation of a television object
	public String toString() {
		String power = null;
		if (this.power) {
			power = "Yes";   								// sets the power string to yes if the TV is on
		} else
			power = "No";									// sets the power string to no if the TV is off

		if (volume == 0) {
			return ("[Television on? " + power + ". Channel: " + this.getChannel() + "/10. Volume:" + this.getVolume()
					+ "% (muted)]");
		} else
			return ("[Television on? " + power + ". Channel: " + this.getChannel() + "/10. Volume:" + this.getVolume()
					+ "%]");

	}
}
