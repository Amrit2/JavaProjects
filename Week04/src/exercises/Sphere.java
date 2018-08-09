package exercises;

public class Sphere {
	private int diameter;
	
	public Sphere(int diameter) {
		this.diameter = diameter;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	
	public double volume() {
		double volume = (4/3)* Math.PI * Math.pow((this.diameter /2), 3);
		return volume;
	}
	
	public double surfaceArea() {
		double surfaceArea = Math.PI*4*Math.pow((this.diameter /2), 2);
		return surfaceArea;
	}
	
	public String toString() {
		return ("The diameter of " + this.diameter + " gives a volume of " + this.volume() + " and a surface area of " + this.surfaceArea());
	}
	
}
