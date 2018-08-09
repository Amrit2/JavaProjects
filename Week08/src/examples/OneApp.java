package examples;

import javax.swing.*;

public class OneApp extends JFrame {
    public OneApp(String name) {
        super(name);

        // Choose to lay out components manually
        getContentPane().setLayout(null);

        // Add the drop-down list
        String[]	addresses = {"Home Address", "Work Address",
					  "Alternate Address"};
        JComboBox addressBox1 = new JComboBox(addresses);
        addressBox1.setLocation(10,10);
        addressBox1.setSize(410,30);
        getContentPane().add(addressBox1);

        // Now add an AddressPanel
        
        
            AddressPanel myPanel = new AddressPanel("CONTACT ADDRESS");
            myPanel.setLocation(10,50);
            getContentPane().add(myPanel);
        

        // Set program to stop when window closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(435, 590); // manually computed sizes
        setResizable(false);
    }

    public static void main(String[] args) {
       JFrame frame = new OneApp("App1");
       frame.setVisible(true);
    }
}
