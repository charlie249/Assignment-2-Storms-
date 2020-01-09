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
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author ian
 */
public class EditStorm extends JPanel {

    public JLabel lblStormName;
    public JLabel lblWindSpeed;
    public JLabel lblTemperature;
    public JLabel lblWarning;

    public JTextField txtStormName;
    public JTextField txtWindSpeed;
    public JTextField txtTemperature;

    public JButton btnSave;
    private Storm currentStorm;

    private GridBagConstraints constraints;
    private final JButton btnDelete;

    public EditStorm(final JList list) {

        this.setLayout(new GridBagLayout());

        lblStormName = new JLabel("Storm Name: ");
        lblWindSpeed = new JLabel("WindSpeed: ");
        lblTemperature = new JLabel("Temperature: ");
        lblWarning = new JLabel("---");

        txtStormName = new JTextField();
        txtStormName.setColumns(10);
        txtWindSpeed = new JTextField();
        txtWindSpeed.setColumns(10);
        txtTemperature = new JTextField();
        txtTemperature.setColumns(10);


        btnSave = new JButton("Save new storm data");
        btnSave.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currentStorm != null)
                {
                    currentStorm.setName(txtStormName.getText());
                    try
                    {
                    currentStorm.setWindSpeed(Integer.parseInt(txtWindSpeed.getText()));
                    } catch(NumberFormatException nfe)
                    {
                        JOptionPane.showMessageDialog(null, "Badly formatted speed, please try again");
                    }
                    try
                    {
                    currentStorm.setTemp(Integer.parseInt(txtTemperature.getText()));
                    } catch(NumberFormatException nfe)
                    {
                        JOptionPane.showMessageDialog(null, "Badly formatted temperature, please try again");
                        
                    }
                    lblWarning.setText("<html>" + currentStorm.getWarning() + "</html>");

                    list.setModel(list.getModel());
                    list.updateUI();
                }
            }
        });

        btnDelete = new JButton("Delete storm");
        btnDelete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currentStorm != null)
                {
                    currentStorm.setName(null);
                    currentStorm.setWindSpeed(0);
                    currentStorm.setTemp(0);
                    list.setModel(list.getModel());
                    list.updateUI();
                }
            }
        });


        
        constraints = new GridBagConstraints();

        constraints.gridy = 0;
        constraints.gridx = 0;          //New row
        constraints.gridwidth = 1;
        this.add(lblStormName, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;          //New row
        //makes text box fill width of column
//        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtStormName, constraints);

        //      constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 2;
        constraints.gridx = 0;
        this.add(lblWindSpeed, constraints);

        //    constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        this.add(txtWindSpeed, constraints);

        //    constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 3;
        constraints.gridx = 0;
        this.add(lblTemperature, constraints);

        //    constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        this.add(txtTemperature, constraints);


        constraints.gridy = 5;
        constraints.gridx = 1;
        this.add(btnSave, constraints);

                //    constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 6;
        constraints.gridx = 1;
        this.add(btnDelete, constraints);

        constraints.gridy = 4;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        this.add(lblWarning, constraints);

    }

    public void setStorm(Storm storm) {
        // display contents of this storm
        currentStorm = storm;
        txtStormName.setText(storm.getName());
        txtWindSpeed.setText("" + storm.getWindSpeed());
        txtTemperature.setText("" + storm.getTemp());
        lblWarning.setText("<html>" + storm.getWarning() + "</html>");
    }
}
