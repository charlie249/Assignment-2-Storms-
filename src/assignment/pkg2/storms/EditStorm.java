/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.storms;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagConstraints;


/**
 *
 * @author ian
 */
public class EditStorm extends JFrame {
        public JLabel lblTitle;
        public JLabel lblStormName;
        public JLabel lblWindSpeed;
        public JLabel lblTemperature;
        
        public JTextField txtStormName;
        public JTextField txtWindSpeed;
        public JTextField txtTemperature;
        
        public JButton btnEdit;
        
        private GridBagConstraints constraints;
        
    public EditStorm()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        
        lblTitle = new JLabel("Edit Storm");
        
        lblStormName = new JLabel("Storm Name: ");
        lblWindSpeed = new JLabel("WindSpeed: ");
        lblTemperature = new JLabel("Temperature: ");
        
        txtStormName = new JTextField();
        txtWindSpeed = new JTextField();
        txtTemperature = new JTextField();
        
        btnEdit = new JButton("Save new storm data");
        
       constraints = new GridBagConstraints();
    }
    


public void layoutComponenets()
{
    constraints.gridy = 0; //sets row
    constraints.gridx = 0; // sets coloumn
    constraints.gridwidth = 2; //two columns wide
}

}