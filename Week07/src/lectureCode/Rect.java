package lectureCode;

public class Rect extends Shape{

	int length;
	int width;
	
	@Override
	public double computeArea()
	{
		double area = length*width;
		System.out.println("Area of a rectangle is "+area);
		return area;
		
	}
	
	
}
