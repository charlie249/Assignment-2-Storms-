/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.storms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author ian
 */
public class EditStorm extends JPanel {

    public JLabel lblTitle;
    public JLabel lblStormName;
    public JLabel lblWindSpeed;
    public JLabel lblTemperature;

    public JTextField txtStormName;
    public JTextField txtWindSpeed;
    public JTextField txtTemperature;

    public JButton btnEdit;
    private Storm currentStorm;

    private GridBagConstraints constraints;

    public EditStorm() {
        this.setLayout(new GridBagLayout());

        lblTitle = new JLabel("Edit Storm");

        lblStormName = new JLabel("Storm Name: ");
        lblWindSpeed = new JLabel("WindSpeed: ");
        lblTemperature = new JLabel("Temperature: ");

        txtStormName = new JTextField();
        txtStormName.setColumns(10);
        txtWindSpeed = new JTextField();
        txtTemperature = new JTextField();

        txtStormName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // do we have a storm?
                if (currentStorm != null) {
                    // set the storm to the new value
                    currentStorm.setName(txtStormName.getText());
                }
            }
        });

        txtWindSpeed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(currentStorm != null){
                    currentStorm.setWindSpeed(Integer.parseInt(txtWindSpeed.getText()));
                }
            }
        });
        
        txtTemperature.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(currentStorm != null){
                    currentStorm.setTemp(Integer.parseInt(txtTemperature.getText()));
                }
            }
        });
        
        btnEdit = new JButton("Save new storm data");

        constraints = new GridBagConstraints();
        
        
        constraints.gridy = 0; //sets row
        constraints.gridx = 0; // sets coloumn
        constraints.gridwidth = 2; //two columns wide
        this.add(lblTitle, constraints); // adds the component

        constraints.gridy = 1;
        constraints.gridx = 0;          //New row
        constraints.gridwidth = 1;
        this.add(lblStormName, constraints);

        constraints.gridx = 1;
        //makes text box fill width of column
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtStormName, constraints);
        
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 2;
        constraints.gridx = 0;
        this.add(lblWindSpeed, constraints);
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        this.add(txtWindSpeed, constraints);
        
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 3;
        constraints.gridx = 0;
        this.add(lblTemperature);
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        this.add(txtTemperature, constraints);
        
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 4;
        constraints.gridx = 0;
        this.add(btnEdit, constraints);    
        
    }


    public void setStorm(Storm storm) {
        // display contents of this storm
        currentStorm = storm;
        txtStormName.setText(storm.getName());
        txtWindSpeed.setText("" + storm.getWindSpeed());
        txtTemperature.setText("" + storm.getTemp());
    }
}
