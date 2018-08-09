package examples;
import   javax.swing.JFrame;

/**
 * Code Downloaded from: 
 * people.scs.carleton.ca/~lanthier/teaching/COMP1406/Notes/Code/Chapter5
 * 
 * 
 * */

public class MyApplication extends JFrame {

    public MyApplication(String title) {
        super(title);                             // Set title of window
        setDefaultCloseOperation(EXIT_ON_CLOSE);  // allow window to close
        setSize(300, 100);                        // Set size of window
        setLayout(null);//layout components manually
    }

    public static void main(String[] args) {
        MyApplication frame;

        frame = new MyApplication("My Window");		// Create window
        frame.setVisible(true);                  	// Show window
    }
}
