package exercises;

public class Box {
	private String height;
	private String width;
	private String depth;
	private boolean full;

	public Box(String height, String width, String depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.full = false;
	}
	public void setFull(boolean full) {
		this.full = full;
	}
	
	public void setHeight(String height) {
		this.height = height;
	}
	
	public void setWidth(String width) {
		this.width = width;
	}
	public void setDepth(String depth) {
		this.depth = depth;
	}
	
	public String getHeight() {
		return this.height;
	}
	public String getWidth() {
	    return this.width;
	}
	public String getDepth() {
		return this.depth;
	}
	
	public String toString() {
		if (full) {
			return ("The box is " + this.getHeight() + "m in height, " + this.getWidth() + "m in width and " + this.getDepth() + "m in depth, and the box is full");
		}
		else
		{
			return ("The box is " + this.getHeight() + "m in height, " + this.getWidth() + "m in width and " + this.getDepth() + "m in depth, and the box is empty");
		}
	}
}
