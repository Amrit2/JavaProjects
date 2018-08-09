package examples;

import javax.swing.*;

public class TwoApp extends JFrame {
    public TwoApp(String name) {
        super(name);

        // Choose to lay out components manually
        getContentPane().setLayout(null);

        // Add the list of names
        String[]	names = {"Bob E. Pins", "Sunny Day", "Jen Tull",
  				    "Bea Keeper", "Ivona Pass"};
        JList aList = new JList(names);
        JScrollPane scrollPane = new JScrollPane(aList,
            ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setLocation(10,10);
        scrollPane.setSize(150,420);
        getContentPane().add(scrollPane);

        // Now add an AddressPanel
        AddressPanel myPanel1 = new AddressPanel("HOME ADDRESS");
        myPanel1.setLocation(170,10);
        getContentPane().add(myPanel1);

        // Now add an another AddressPanel
        AddressPanel myPanel2 = new AddressPanel("ALTERNATE ADDRESS");
        myPanel2.setLocation(170,230);
        getContentPane().add(myPanel2);

        // Set program to stop when window closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(590, 470); // manually computed sizes
        setResizable(false);
    }

    public static void main(String[] args) {
       JFrame frame = new TwoApp("App2");
       frame.setVisible(true);
    }
}
