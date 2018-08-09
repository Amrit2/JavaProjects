package lectureCode;

import javax.swing.JFrame;

public class MyApplication extends JFrame{
	
	
	public MyApplication(String title)
	{
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,100);
	}
	
	public static void main(String[] args)
	{
		MyApplication frame;
		frame = new MyApplication("My Window");
		frame.setVisible(true);
		
	}

}
