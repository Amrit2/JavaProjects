package lectureCode;

public class Circle extends Shape
{
	double radius;
	
	public double getCircleRadius()
	{
		return this.radius;
	}

	@Override
	public double computeArea()
	{
		double area = Math.PI*Math.pow(radius,2);
		System.out.println("Area of a circle is "+area);		
		return area;
	}


}
