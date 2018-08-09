package lectureCode;

abstract public class Shape
{
	//????

	abstract public double computeArea();

	public static void main(String[] args)
	{

		Circle circle = new Circle();
		circle.radius = 5;


		Rect r = new Rect();
		r.length = 5; 
		r.width= 10;


		Shape shape = circle;
		//	shape.computeArea();
		shape = r;
		//shape.computeArea();

		shape = new Triangle();
		//shape.computeArea();		

		Shape[] shapes = new Shape[5];

		shapes[0] = circle;
		shapes[1] = new Circle();
		shapes[2] = new Rect();
		shapes[3] = new Triangle();
		shapes[4] = new Rect();

		for(Shape s : shapes)
		{		
		}


	}


}
