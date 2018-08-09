package exercises;

public class Grade {
	private int percentage;
	
	public Grade(int percentage) {
		this.setPercentage(percentage);
	}
	
	public void setPercentage (int Percentage) {
		if ((Percentage >= 0) && (Percentage  <= 100)) {
			this.percentage = Percentage;
		}
		else
			this.percentage = 0;
	}
	
	public int getPercentage() {
		return this.percentage;
	}
}
