/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.storms;

import assignment.pkg2.storms.Storm.Blizzard;
import assignment.pkg2.storms.Storm.Hurricane;
import assignment.pkg2.storms.Storm.Tornado;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author charlie
 */
public class SAC_GUI extends JFrame {

    public SAC_GUI(final Company SAC) {
        // add list box
        JList list = new JList(SAC.storms);

        JScrollPane scroller = new JScrollPane(list);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        getContentPane().add(BorderLayout.WEST, scroller);

        final EditStorm editForm = new EditStorm(list, SAC.storms);
        getContentPane().add(BorderLayout.CENTER, editForm);
        
        JLabel title = new JLabel("Storm Advice Centre", JLabel.CENTER);
        // create taller font
        title.setFont(title.getFont().deriveFont(28f));
        getContentPane().add(BorderLayout.NORTH, title);

        // sets number of lines to show before scrolling
        list.setVisibleRowCount(20);
        
        list.setPreferredSize(new Dimension(200, 100));

        // restricts the user to selecting only one at a time
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        DefaultListCellRenderer renderer = new DefaultListCellRenderer(){
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Storm storm = (Storm) value;
                JLabel res; 
                if(storm != null)
                    res = new JLabel(storm.toString());
                else
                    res = new JLabel("Pending");
                res.setOpaque(isSelected);
                return res;
            }
        };
        
        list.setCellRenderer(renderer);

        // registers for list selection events
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting() == false) {
                    final int index = e.getLastIndex();
                    Storm storm = SAC.storms[index];
                    if (storm == null) {
                        storm = new Hurricane();
                        SAC.storms[index] = storm;
                    }
                    System.out.println("Editing:" + storm);
                    // now edit this storm
                    editForm.setStorm(storm, index);
                }
            }
        });

        // give storms to list box
        // listen to list item being clicked
        // show editor for this list item
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");

        // create company
        Company SAC = new Company();

        SAC.storms[0] =  new Hurricane("Hurr 1", 100, 34);
        SAC.storms[4] =  new Tornado("Torn 5", 200, 24);
        SAC.storms[11] =  new Blizzard("Blizz 12", 140, 14);

        // look how your sample code createa a new frame
        SAC_GUI frame = new SAC_GUI(SAC);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(1200, 450);
        frame.setVisible(true);

    }

}
