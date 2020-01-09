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
    private Storm currentStorm;
        
    public EditStorm()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblTitle = new JLabel("Edit Storm");
        
        lblStormName = new JLabel("Storm Name: ");
        lblWindSpeed = new JLabel("WindSpeed: ");
        lblTemperature = new JLabel("Temperature: ");
        
        txtStormName = new JTextField();
        txtWindSpeed = new JTextField();
        txtTemperature = new JTextField();
        
        txtStormName.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // do we have a storm?
                if(currentStorm != null)
                {
                    // set the storm to the new value
                    currentStorm.setName(txtStormName.getText());
                }
            }
        });
        
        btnEdit = new JButton("Save new storm data");
    }
    
    public void setStorm(Storm storm)
    {
        // display contents of this storm
        currentStorm = storm;
    }
    
}
