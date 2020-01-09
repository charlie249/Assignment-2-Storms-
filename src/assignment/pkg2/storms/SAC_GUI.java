/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.storms;

import assignment.pkg2.storms.Storm.Hurricane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import static java.util.Collections.list;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
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

        EditStorm editForm = new EditStorm();
        getContentPane().add(BorderLayout.CENTER, editForm);

        // sets number of lines to show before scrolling
        list.setVisibleRowCount(20);
        
        list.setPreferredSize(new Dimension(200, 100));

        // restricts the user to selecting only one at a time
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        list.setCellRenderer(new ListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Storm storm = (Storm) value;
                if(storm != null)
                    return new JLabel(storm.toString());
                else
                    return new JLabel("Pending");
            }
        });

        // registers for list selection events
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting() == false) {
                    System.out.println(e.getFirstIndex() + " selected");
                    final int index = e.getFirstIndex();
                    Storm storm = SAC.storms[index];
                    if (storm != null) {
                        System.out.println(storm.toString());
                    }
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

        Hurricane h1 = new Hurricane();
        h1.setName("Hurr 1");
        h1.setTemp(23);
        h1.setWindSpeed(200);

        SAC.storms[0] = h1;

        // look how your sample code createa a new frame
        SAC_GUI frame = new SAC_GUI(SAC);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setVisible(true);

    }

}
