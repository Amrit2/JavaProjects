package examples;

import javax.swing.*;

public class AddressPanel extends JPanel {
    
    
    
    public AddressPanel(String title) {
        // Choose to lay out components manually
        this.setLayout(null);

        // Make a border around the outside with the given title
        this.setBorder(BorderFactory.createTitledBorder(title));

        // Add the Name, Street, City, Province and PostalCode labels
        JLabel aLabel = new JLabel("Name:");
        aLabel.setLocation(10, 20);
        aLabel.setSize(80,30);
        this.add(aLabel);

        aLabel = new JLabel("Street:");
        aLabel.setLocation(10, 55);
        aLabel.setSize(80,30);
        add(aLabel);

        aLabel = new JLabel("City:");
        aLabel.setLocation(10, 90);
        aLabel.setSize(80,30);
        add(aLabel);

        aLabel = new JLabel("Province:");
        aLabel.setLocation(10, 125);
        aLabel.setSize(80,30);
        add(aLabel);
        aLabel = new JLabel("Postal Code:");
        aLabel.setLocation(10, 160);
        aLabel.setSize(80,30);
        add(aLabel);

        // Add the name textfield
        JTextField nameField = new JTextField();
        nameField.setLocation(100, 20);
        nameField.setSize(300,30);
        add(nameField);

        // Add the street textfield
        JTextField streetField = new JTextField();
        streetField.setLocation(100, 55);
        streetField.setSize(300,30);
        add(streetField);

        // Add the city textfield
        JTextField cityField = new JTextField();
        cityField.setLocation(100, 90);
        cityField.setSize(300,30);
        add(cityField);

        // Add the province textfield
        JTextField provinceField = new JTextField();
        provinceField.setLocation(100, 125);
        provinceField.setSize(300,30);
        add(provinceField);

        // Add the postal code textfield
        JTextField postalField = new JTextField();
        postalField.setLocation(100, 160);
        postalField.setSize(300,30);
        add(postalField);

        setSize(410, 200);
    }



}
