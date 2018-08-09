package lectureCode;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;

public class MyFruitList extends JFrame{

	
	public MyFruitList(String title)
	{
		super(title);
		
		this.getContentPane().setLayout(null);
		this.setResizable(false);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300,300);
		
		JTextField newItemTextField = new JTextField("Hello World!");
		newItemTextField.setLocation(10, 10);
		newItemTextField.setSize(150,25);
		this.getContentPane().add(newItemTextField);
		
		//add an ADD button
		JButton addButton = new JButton("add");
		addButton.setLocation(175, 10);
		addButton.setSize(100,25);
		this.getContentPane().add(addButton);
		
		//add an ADD button
		JButton remButton = new JButton("remove");
		remButton.setLocation(175, 45);
		remButton.setSize(100,25);
		this.getContentPane().add(remButton);
		
		//JList
		String[] fruits = {"Apples","Oranges","Pears","Tomato"};
		JList fruitList = new JList(fruits);
		fruitList.setLocation(10,45);
		fruitList.setSize(150,150);
		this.getContentPane().add(fruitList);
		
		
	}
	
	public static void main(String[] args) 
	{
		MyFruitList frame;
		frame = new MyFruitList("My Fruit Title");
		frame.setVisible(true);

	}

}
