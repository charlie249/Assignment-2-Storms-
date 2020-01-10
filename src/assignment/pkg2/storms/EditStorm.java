/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.storms;

import assignment.pkg2.storms.Storm.Blizzard;
import assignment.pkg2.storms.Storm.Hurricane;
import assignment.pkg2.storms.Storm.Tornado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author charlie
 */
public class EditStorm extends JPanel {

    public JLabel lblStormName;
    public JLabel lblWindSpeed;
    public JLabel lblTemperature;
    public JLabel lblWarning;

    public JTextField txtStormName;
    public JTextField txtWindSpeed;
    public JTextField txtTemperature;
    
    public JComboBox<String> combType;

    public JButton btnSave;
    private Storm currentStorm;

    private GridBagConstraints constraints;
    private final JButton btnDelete;
    private int index;
    private final Storm[] storms;

    public EditStorm(final JList list, Storm[] stormsIn) {

        storms = stormsIn;
        
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
        
        String[] stormTypes = {"Hurricane", "Tornado", "Blizzard"};
        combType = new JComboBox<String>(stormTypes);

        btnSave = new JButton("Save new storm data");
        btnSave.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currentStorm != null)
                {
                    // checking it's the correct type of storm
                    String stormType = currentStorm.getType();
                    String selection = (String) combType.getSelectedItem();
                    if(!selection.equals(stormType))
                    {
                        // changing the storm type
                        switch(selection)
                        {
                            case "Hurricane":
                                currentStorm = new Hurricane();
                                break;
                            case "Tornado":
                                currentStorm = new Tornado();
                                break;
                            case "Blizzard":
                                currentStorm = new Blizzard();
                                break;
                        }
                        // put the new object back in the list
                        storms[index] = currentStorm;
                        
                    }
                    
                    currentStorm.setName(txtStormName.getText());
                    try
                    {
                    currentStorm.setWindSpeed(Integer.parseInt(txtWindSpeed.getText()));
                    } catch(NumberFormatException nfe)
                    {
                        JOptionPane.showMessageDialog(null, "Badly formatted windspeed, please try again");
                    }
                    try
                    {
                    currentStorm.setTemp(Integer.parseInt(txtTemperature.getText()));
                    } catch(NumberFormatException nfe)
                    {
                        JOptionPane.showMessageDialog(null, "Badly formatted temperature, please try again");
                        
                    }
                    lblWarning.setText("<html>" + currentStorm.getWarning() + "</html>");

                    // update the list with the new array
                    list.setListData(storms);
                    
                    // get the list to update
//                    list.updateUI();
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
        this.add(new JLabel("Storm Type"), constraints);

        constraints.gridy = 0;
        constraints.gridx = 1;          //New row
        constraints.gridwidth = 1;
        this.add(combType, constraints);
        

        constraints.gridy = 1;
        constraints.gridx = 0;          //New row
        constraints.gridwidth = 1;
        this.add(lblStormName, constraints);

        constraints.gridy = 1;          //New row
        constraints.gridx = 1;
        //makes text box fill width of column
//        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtStormName, constraints);

        //      constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 3;
        constraints.gridx = 0;
        this.add(lblWindSpeed, constraints);

        //    constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        this.add(txtWindSpeed, constraints);

        //    constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 4;
        constraints.gridx = 0;
        this.add(lblTemperature, constraints);

        //    constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        this.add(txtTemperature, constraints);


        constraints.gridy = 7;
        constraints.gridx = 1;
        this.add(btnSave, constraints);

                //    constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 8;
        constraints.gridx = 1;
        this.add(btnDelete, constraints);

        constraints.gridy = 6;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        this.add(lblWarning, constraints);

    }

    public void setStorm(Storm storm, int indexIn) {
        // display contents of this storm
        currentStorm = storm;
        index = indexIn;
        combType.setSelectedItem(storm.getType());
        txtStormName.setText(storm.getName());
        txtWindSpeed.setText("" + storm.getWindSpeed());
        txtTemperature.setText("" + storm.getTemp());
        lblWarning.setText("<html>" + storm.getWarning() + "</html>");
    }
}
