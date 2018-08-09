package examples;

import   javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ComponentExample extends JFrame {

    public ComponentExample(String title) {
        super(title);                             // Set title of window
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);  // allow window to close
        setSize(300, 100);                        // Set size of window
        
        JButton button = new JButton("A button");//create a new button component
        button.setSize(20,20); //set the component size
        this.getContentPane().add(button);//add the button to the JFrame             
        
        pack();//Size the frame.
    }

    public static void main(String[] args) {
        ComponentExample frame;

        frame = new ComponentExample("My Component Example");// Create window
        frame.setVisible(true);                // Show window
    }
}
